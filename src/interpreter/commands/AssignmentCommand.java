package interpreter.commands;

import antlr.TripleJLexer;
import antlr.TripleJParser;
import execution.ExecutionManager;
import interpreter.representations.TripleJValue;
import interpreter.representations.TripleJArray;
import interpreter.representations.TripleJValue;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

public class AssignmentCommand implements INTCommand {

    private final static String TAG = "MobiProg_NewAssignmentCommand";

    private TripleJParser.ExpressionContext leftHandExprCtx;
    private TripleJParser.ExpressionContext rightHandExprCtx;

    public AssignmentCommand(TripleJParser.ExpressionContext leftHandExprCtx,
                             TripleJParser.ExpressionContext rightHandExprCtx) {
        this.leftHandExprCtx = leftHandExprCtx;
        this.rightHandExprCtx = rightHandExprCtx;

        UndeclaredChecker undeclaredChecker = new UndeclaredChecker(this.leftHandExprCtx);
        undeclaredChecker.verify();

        ConstChecker constChecker = new ConstChecker(this.leftHandExprCtx);
        constChecker.verify();

        undeclaredChecker = new UndeclaredChecker(this.rightHandExprCtx);
        undeclaredChecker.verify();


        ParseTreeWalker functionWalker = new ParseTreeWalker();
        functionWalker.walk(new MethodCallVerifier(), this.rightHandExprCtx);

        //type check the mobivalue
        TripleJValue tripleJValue;
        if(ExecutionManager.getInstance().isInFunctionExecution()) {
            tripleJValue = VariableSearcher.searchVariableInFunction(ExecutionManager.getInstance().getCurrentFunction(), this.leftHandExprCtx.getText());
        }
        else {
            tripleJValue = VariableSearcher.searchVariable(this.leftHandExprCtx.getText());
        }

        TypeChecker typeChecker = new TypeChecker(baracoValue, this.rightHandExprCtx);
        typeChecker.verify();
    }

    @Override
    public void execute() {
        EvaluationCommand evaluationCommand = new EvaluationCommand(this.rightHandExprCtx);
        evaluationCommand.execute();

        if(evaluationCommand.hasException())
            return;

        if(this.isLeftHandArrayAccessor()) {

            if(evaluationCommand.isNumericResult())
                this.handleArrayAssignment(evaluationCommand.getResult().toEngineeringString());
            else
                this.handleArrayAssignment(evaluationCommand.getStringResult());
        }
        else {
            TripleJValue tripleJValue = VariableSearcher.searchVariable(this.leftHandExprCtx.getText());

            if (evaluationCommand.isNumericResult()) {

                if (!tripleJValue.isFinal()) {
                    AssignmentUtils.assignAppropriateValue(tripleJValue, evaluationCommand.getResult());
                }

            } else {

                if (!tripleJValue.isFinal()) {
                    AssignmentUtils.assignAppropriateValue(tripleJValue, evaluationCommand.getStringResult());
                }
            }
        }
    }

    public boolean isLeftHandArrayAccessor() {
        List<TerminalNode> lBrackTokens = this.leftHandExprCtx.getTokens(TripleJLexer.LBRACK);
        List<TerminalNode> rBrackTokens = this.leftHandExprCtx.getTokens(TripleJLexer.RBRACK);

        return(lBrackTokens.size() > 0 && rBrackTokens.size() > 0);
    }

    private void handleArrayAssignment(String resultString) {
        TerminalNode identifierNode = this.leftHandExprCtx.expression(0).primary().Identifier();
        TripleJParser.ExpressionContext arrayIndexExprCtx = this.leftHandExprCtx.expression(1);

        TripleJValue tripleJValue = VariableSearcher.searchVariable(identifierNode.getText());
        TripleJArray tripleJArray = (TripleJArray) tripleJValue.getVal();

        EvaluationCommand evaluationCommand = new EvaluationCommand(arrayIndexExprCtx);
        evaluationCommand.execute();

        ExecutionManager.getInstance().setCurrentCheckedLineNumber(arrayIndexExprCtx.getStart().getLine());

        //create a new array value to replace value at specified index
        TripleJValue newArrayValue = new TripleJValue(null, tripleJArray.getPrimitiveType());
        newArrayValue.setVal(resultString);
        tripleJArray.updateValueAt(newArrayValue, evaluationCommand.getResult().intValue());

        //Console.log("Index to access: " +evaluationCommand.getResult().intValue()+ " Updated with: " +resultString);
    }

    public TripleJParser.ExpressionContext getLeftHandExprCtx() {
        return leftHandExprCtx;
    }

    public TripleJParser.ExpressionContext getRightHandExprCtx() {
        return rightHandExprCtx;
    }
}