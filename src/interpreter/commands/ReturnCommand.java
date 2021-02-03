package commands;

import antlr.TripleJParser;
import items.TripleJFunction;
import items.TripleJValue;

public class ReturnCommand implements INTCommand {

    private TripleJParser.ExpressionContext expressionCtx;
    private TripleJFunction assignedTripleJFunction;

    public ReturnCommand(TripleJParser.ExpressionContext expressionCtx, TripleJFunction corgiFunction) {
        this.expressionCtx = expressionCtx;
        this.assignedTripleJFunction = corgiFunction;

        UndeclaredChecker undeclaredChecker = new UndeclaredChecker(this.expressionCtx);
        undeclaredChecker.verify();

        TripleJValue tripleJValue = this.assignedTripleJFunction.getReturnValue();
        TypeChecker typeChecker = new TypeChecker(tripleJValue, this.expressionCtx);
        typeChecker.verify();
    }

    @Override
    public void execute() {
        EvaluationCommand evaluationCommand = new EvaluationCommand(this.expressionCtx);
        evaluationCommand.execute();

        TripleJValue tripleJValue = this.assignedTripleJFunction.getReturnValue();

        AssignmentUtilities.assignAppropriateValue(tripleJValue, evaluationCommand.getResult());
        //Console.log(LogType.DEBUG,"Return value is: " +evaluationCommand.getResult().toEngineeringString());
    }

}
