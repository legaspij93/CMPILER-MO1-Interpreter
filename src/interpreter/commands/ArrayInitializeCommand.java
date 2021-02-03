package interpreter.commands;

import antlr.TripleJParser;
import execution.ExecutionManager;
import interpreter.representations.TripleJArray;
import items.TripleJArray;
import org.antlr.v4.runtime.Token;

public class ArrayInitializeCommand implements INTCommand {

    private TripleJArray assignedTripleJArray;
    private TripleJParser.ArrayCreatorRestContext arrayCreatorCtx;

    public ArrayInitializeCommand(TripleJArray tripleJArray, TripleJParser.ArrayCreatorRestContext arrayCreatorCtx) {
        this.assignedTripleJArray = tripleJArray;
        this.arrayCreatorCtx = arrayCreatorCtx;

        if (arrayCreatorCtx.expression(0) != null) {
            if (arrayCreatorCtx.expression(0).getText().contains("\"") || arrayCreatorCtx.expression(0).getText().contains(".")) {
                Token firstToken = this.arrayCreatorCtx.getStart();
                int lineNumber = firstToken.getLine();

                BuildChecker.reportCustomError(ErrorRepository.INVALID_INDEX_ASSIGN, "", lineNumber);
            }
        }
    }

    @Override
    public void execute() {
        TripleJParser.ExpressionContext exprCtx = this.arrayCreatorCtx.expression(0);

        if(exprCtx != null) {
            EvaluationCommand evaluationCommand = new EvaluationCommand(exprCtx);
            evaluationCommand.execute();

            ExecutionManager.getInstance().setCurrentCheckedLineNumber(exprCtx.getStart().getLine());
            this.assignedTripleJArray.initializeSize(evaluationCommand.getResult().intValue());
        }

    }
}
