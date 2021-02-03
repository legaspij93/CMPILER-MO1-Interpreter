package commands;

import antlr.TripleJParser;
import execution.ExecutionManager;
import execution.ExecutionMonitor;


public class DoWhileCommand extends WhileCommand {

    public DoWhileCommand(TripleJParser.ParExpressionContext parExprCtr) {
        super(parExprCtr);
    }

    @Override
    public void execute() {
        this.executeFirstCommandSequence();
        super.execute();
    }

    /*
     * Executes the first command sequence before actually executing the behavior for the while command
     */
    private void executeFirstCommandSequence() {
        this.identifyVariables();

        ExecutionMonitor executionMonitor = ExecutionManager.getInstance().getExecutionMonitor();

        try {
            for(INTCommand command : this.commandSequences) {
                executionMonitor.tryExecution();
                command.execute();
            }

        } catch(InterruptedException e) {
            //Log.e(TAG, "Monitor block interrupted! " +e.getMessage());
            System.err.println("DoWhileCommand: Monitor block interrupted! " + e.getMessage()); //TODO Change to IDE
        }
    }

    @Override
    public ControlType getControlType() {
        return ControlType.DO_WHILE;
    }
}