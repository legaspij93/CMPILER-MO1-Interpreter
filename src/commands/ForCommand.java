package commands;

import antlr.TripleJParser;
import execution.ExecutionManager;
import execution.ExecutionMonitor;

import java.util.ArrayList;
import java.util.List;

public class ForCommand implements INTControlledCommand {
    private final static String TAG = "ForCommand";

    private List<INTCommand> commandSeq;

    private antlr.TripleJParser.LocalVariableDeclarationContext localVarDecCtx;
    private TripleJParser.ExpressionContext conditionalExpr;
    private INTCommand updateCommand;

    private String modifiedConditionExpr;

    public ForCommand(TripleJParser.LocalVariableDeclarationContext localVarDecCtx, TripleJParser.ExpressionContext conditionalExpr, INTCommand updateCommand) {
        this.localVarDecCtx = localVarDecCtx;
        this.conditionalExpr = conditionalExpr;
        this.updateCommand = updateCommand;

        this.commandSeq = new ArrayList<INTCommand>();
    }

    @Override
    public void execute() {
        this.evaluateLocalVariable();
        this.identifyVariables();

        ExecutionMonitor executionMonitor = ExecutionManager.getInstance().getExecutionMonitor();

        try {
            //evaluate the given condition
            while(ConditionalEvaluator.evaluateCondition(this.conditionalExpr)) {
                for(INTCommand command : this.commandSeq) {
                    executionMonitor.tryExecution();
                    command.execute();
                }

                this.updateCommand.execute(); //execute the update command
                this.identifyVariables(); //identify variables again to detect changes to such variables used.
            }

        } catch(InterruptedException e) {
            System.out.println(TAG + ": " + "Monitor block interrupted! " +e.getMessage()); //TODO Change to IDE
        }
    }

    private void evaluateLocalVariable() {
        if(this.localVarDecCtx != null) {
            LocalVariableAnalyzer localVarAnalyzer = new LocalVariableAnalyzer();
            localVarAnalyzer.markImmediateExecution();
            localVarAnalyzer.analyze(this.localVarDecCtx);
        }
    }

    private void identifyVariables() {
        IValueMapper identifierMapper = new IdentifierMapper(this.conditionalExpr.getText());
        identifierMapper.analyze(this.conditionalExpr);

        this.modifiedConditionExpr = identifierMapper.getModifiedExp();
    }

    @Override
    public ControlType getControlType() {
        return ControlType.FOR;
    }

    @Override
    public void addCommand(INTCommand command) {

        System.out.println("Added command to FOR");
        this.commandSeq.add(command);
    }

    public int getCommandCount() {
        return this.commandSeq.size();
    }

}
