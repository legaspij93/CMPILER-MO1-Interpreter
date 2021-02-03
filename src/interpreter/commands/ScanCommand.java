package interpreter.commands;

import antlr.TripleJParser;
import execution.ExecutionManager;
import items.TripleJArray;
import items.TripleJValue;
import utils.StringUtils;

import javax.management.NotificationListener;

public class ScanCommand implements INTCommand, NotificationListener {

    //private final static String TAG = "MobiProg_ScanCommand";

    private String messageToDisplay;
    private String identifier;
    private TripleJValue.ExpressionContext array;

    public ScanCommand(String messageToDisplay, String identifier) {
        this.messageToDisplay = StringUtils.removeQuotes(messageToDisplay);
        this.identifier = identifier;

    }

    public ScanCommand(String messageToDisplay, TripleJValue.ExpressionContext array, String identifier) {
        this.messageToDisplay = StringUtils.removeQuotes(messageToDisplay);
        this.array = array;
        this.identifier = identifier;
    }

    @Override
    public void execute() {
        System.out.println("Found scan statement");
        NotificationCenter.getInstance().addObserver(Notifications.ON_SCAN_DIALOG_DISMISSED, this); //add an observer to listen to when the dialog has been dismissed

        Parameters params = new Parameters();
        params.putExtra(KeyNames.MESSAGE_DISPLAY_KEY, this.messageToDisplay);

        ExecutionManager.getInstance().blockExecution();

        NotificationCenter.getInstance().postNotification(Notifications.ON_FOUND_SCAN_STATEMENT, params);
    }

    private void acquireInputFromUser(Parameters params) {
        String valueEntered = params.getStringExtra(KeyNames.VALUE_ENTERED_KEY, "");

        boolean success;

        if(this.array == null) {
            TripleJValue tripleJValue = TripleJValueSearcher.searchBaracoValue(identifier);
            //insert if array here
            try {
                tripleJValue.setValue(valueEntered);
                success = true;
            } catch (NumberFormatException ex) {
                success = false;
                NotificationCenter.getInstance().removeObserver(Notifications.ON_SCAN_DIALOG_DISMISSED, this); //remove observer after using
                this.execute();

            }
        }
        else {
            handleArrayAssignment(valueEntered);
            success = true;
        }

        if(success) {
            NotificationCenter.getInstance().removeObserver(Notifications.ON_SCAN_DIALOG_DISMISSED, this); //remove observer after using
            ExecutionManager.getInstance().resumeExecution(); //resume execution of thread
        }

    }

    @Override
    public void onNotify(String notificationString, Parameters params) {
        if(notificationString == Notifications.ON_SCAN_DIALOG_DISMISSED) {
            this.acquireInputFromUser(params);
        }
    }

    private void handleArrayAssignment(String resultString) {
        TripleJParser.ExpressionContext arrayIndexExprCtx = this.array;

        TripleJValue tripleJValue = VariableSearcher.searchVariable(this.identifier);
        TripleJArray tripleJArray = (TripleJArray) tripleJValue.getValue();

        EvaluationCommand evaluationCommand = new EvaluationCommand(arrayIndexExprCtx);
        evaluationCommand.execute();

        //create a new array value to replace value at specified index
        TripleJValue newArrayValue = new TripleJValue(null, tripleJArray.getPrimitiveType());
        newArrayValue.setValue(resultString);
        tripleJArray.updateValueAt(newArrayValue, evaluationCommand.getResult().intValue());

        //Console.log("Index to access: " +evaluationCommand.getResult().intValue()+ " Updated with: " +resultString);
    }
}