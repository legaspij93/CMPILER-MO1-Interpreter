package commands;

import antlr.TripleJParser;
import execution.ExecutionManager;
import execution.ExecutionMonitor;

import java.util.ArrayList;
import java.util.List;

public class WhileCommand implements INTControlledCommand {

    protected List<INTCommand> commandSequences; //the list of commands inside the WHILE statement

    protected TripleJParser.ParExpressionContext conditionalExpr;
    protected String modifiedConditionExpr;

    public WhileCommand(TripleJParser.ParExpressionContext conditionalExpr) {
        this.commandSequences = new ArrayList<>();
        this.conditionalExpr = conditionalExpr;
    }

    @Override
    public void execute() {
        this.identifyVariables();

        ExecutionMonitor executionMonitor = ExecutionManager.getInstance().getExecutionMonitor();

        try {
            while(ConditionalEvaluator.evaluateCondition(this.conditionalExpr)) {
                for(INTCommand command : this.commandSequences) {
                    executionMonitor.tryExecution();
                    command.execute();
                }

                this.identifyVariables();
            }

        } catch(InterruptedException e) {
           System.out.println("While Command Interrupted" + e.getMessage());
        }
    }

    protected void identifyVariables() {
        IValueMapper identifierMapper = new IdentifierMapper(this.conditionalExpr.getText());
        identifierMapper.analyze(this.conditionalExpr);

        this.modifiedConditionExpr = identifierMapper.getModifiedExp();
    }

    @Override
    public ControlType getControlType() {
        return ControlType.WHILE;
    }

    @Override
    public void addCommand(INTCommand command) {

        this.commandSequences.add(command);
    }

    public int getCommandCount() {
        return this.commandSequences.size();
    }

}
