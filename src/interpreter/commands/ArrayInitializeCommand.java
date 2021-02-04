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

    }

    @Override
    public void execute() {
        TripleJParser.ExpressionContext exprCtx = this.arrayCreatorCtx.expression(0);

        if(exprCtx != null) {
            EvaluationCommand evaluationCommand = new EvaluationCommand(exprCtx);
            evaluationCommand.execute();

            if (isInteger(evaluationCommand.getResult().toString()))
                this.assignedTripleJArray.initializeSize(evaluationCommand.getResult().intValue());
            else{
                Token token = arrayCreatorCtx.expression(0).getStart();
                BuildChecker.reportCustomError(SemanticErrorDictionary.TYPE_MISMATCH,"Array Size should be integer." , token.getLine());
            }
        }

    }

    public boolean isInteger( String input ) {
        try {
            Integer.parseInt( input );
            return true;
        }
        catch( Exception e ) {
            return false;
        }
    }
}
