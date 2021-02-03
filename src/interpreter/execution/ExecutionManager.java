package interpreter.execution;

import interpreter.execution.adders.FunctionExecutionAdder;
import interpreter.execution.adders.IExecutionAdder;
import interpreter.execution.adders.MainExecutionAdder;
import interpreter.representations.TripleJFunction;
import interpreter.utils.Notifications;
import interpreter.utils.Parameters;

import javax.management.NotificationListener;
import java.util.ArrayList;

public class ExecutionManager implements NotificationListener {

    private static ExecutionManager sharedInstance = null;

    public static ExecutionManager getInstance(){
        return sharedInstance;
    }

    private ArrayList<commands.ICommand> execList = new ArrayList<commands.ICommand>();
    private boolean foundEntry = false;
    private String entryName = null;

    private ExecutionThread executionThread;
    private ExecutionMonitor executionMonitor;

    private IExecutionAdder activeExecutionAdder;
    private MainExecutionAdder mainExecutionAdder;

    private ExecutionManager(){
        this.mainExecutionAdder = new MainExecutionAdder(this.execList);
        this.activeExecutionAdder = this.mainExecutionAdder;
    }

    public static void initialize(){
        sharedInstance = new ExecutionManager();
        NotificationCenter.getInstance().addObserver(Notifications.ON_EXECUTION_FINISHED, sharedInstance);
    }

    public static void reset(){
        sharedInstance.foundEntry = false;
        sharedInstance.entryName = null;
        sharedInstance.clearAllActions();

        NotificationCenter.getInstance().removeObserver(Notifications.ON_EXECUTION_FINISHED, sharedInstance);
    }

    public void reportFoundEntry(String entryName){
        this.entryName = entryName;
        this.foundEntry = true;
    }

    public boolean hasFoundEntry(){
        return this.foundEntry;
    }

    public String getEntryName(){
        return this.entryName;
    }

    public void addCommand(commands.ICommand command){
        this.activeExecutionAdder.addCommand(command);
    }

    public void deleteCommand(commands.ICommand command){
        this.execList.remove(command);
    }

    public void openFunctionExecution(TripleJFunction function) {
        FunctionExecutionAdder functionExecutionAdder = new FunctionExecutionAdder(function);
        this.activeExecutionAdder = functionExecutionAdder;
    }

    public boolean isInFunctionExecution() {
        return (this.activeExecutionAdder instanceof FunctionExecutionAdder);
    }

    public TripleJFunction getCurrentFunction() {
        if(this.isInFunctionExecution()) {
            FunctionExecutionAdder functionExecAdder = (FunctionExecutionAdder) this.activeExecutionAdder;

            return functionExecAdder.getAssignedFunction();
        }
        else {
            System.err.println("Execution manager is not in a function!");
            return null;
        }
    }

    public void closeFunctionExecution() {
        this.activeExecutionAdder = this.mainExecutionAdder;
    }

    public void blockExecution() {
        this.executionMonitor.claimExecFlag();
    }

    public void resumeExecution() {
        this.executionMonitor.releaseExecFlag();
    }

    /*
     * Spawns a worker thread to handle execution of actions. A semaphore flag is included that may attempt to be claimed by specific commands (like SCAN statement).
     * This causes the execution thread to temporarily halt until released.
     */
    public void executeAllActions() {
        this.executionMonitor = new ExecutionMonitor();
        this.executionThread = new ExecutionThread(this.execList, this.executionMonitor);
        this.executionThread.start();
    }

    public void clearAllActions() {
        this.execList.clear();
    }

    public ExecutionMonitor getExecutionMonitor() {
        return this.executionMonitor;
    }

    @Override //TODO: REMOVE IF NEEDED
    public void onNotify(String notificationString, Parameters params) {
        if(notificationString == Notifications.ON_EXECUTION_FINISHED) {
            //SymbolTableManager.getInstance().resetClassTables(); //TODO: does not work as intended
        }
    }
}
}
