package interpreter.commands;

import antlr.TripleJParser;
import execution.ExecutionManager;
import interpreter.representations.TripleJValue;
import interpreter.representations.TripleJValueSearcher;
import interpreter.utils.KeyNames;
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
        String valueEntered = "";

        valueEntered = params.getStringExtra(KeyNames.VALUE_ENTERED_KEY, "");
        //TODO Change to IDE Front-End


        TripleJValue tripleJValue = TripleJValueSearcher.searchVariable(identifier);
        tripleJValue.setValue(valueEntered);

        NotificationCenter.getInstance().removeObserver(Notifications.ON_SCAN_DIALOG_DISMISSED, this); //remove observer after using
        ExecutionManager.getInstance().resumeExecution(); //resume execution of thread.
    }

    @Override
    public void onNotify(String notificationString, Parameters params) {
        if(notificationString == Notifications.ON_SCAN_DIALOG_DISMISSED) {
            this.acquireInputFromUser(params);
        }
    }
}