package commands;

import antlr.TripleJLexer;
import antlr.TripleJParser;
import execution.ExecutionManager;
import items.TripleJArray;
import items.TripleJValue;

public class ShorthandCommand implements INTCommand {

    private TripleJParser.ExpressionContext leftHandExprCtx;
    private TripleJParser.ExpressionContext rightHandExprCtx;
    int tokenSign;

    public ShorthandCommand(TripleJParser.ExpressionContext leftHandExprCtx,
                            TripleJParser.ExpressionContext rightHandExprCtx, int tokenSign) {
        this.leftHandExprCtx = leftHandExprCtx;
        this.rightHandExprCtx = rightHandExprCtx;
        this.tokenSign = tokenSign;

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

        TypeChecker typeChecker = new TypeChecker(tripleJValue, this.rightHandExprCtx);
        typeChecker.verify();
    }

    @Override
    public void execute() {
        EvaluationCommand evaluationCommand = new EvaluationCommand(this.rightHandExprCtx);
        evaluationCommand.execute();

        if (evaluationCommand.hasException())
            return;

        if(this.isLeftHandArrayAccessor()) {
            this.handleArrayAssignment(evaluationCommand.getResult().toEngineeringString());
        }
        else {
            TripleJValue tripleJValue = VariableSearcher.searchVariable(this.leftHandExprCtx.getText());

            if (evaluationCommand.isNumericResult()) {

                if (!tripleJValue.isFinal()) {
                    // Add checking for shorthand expressions
                    AssignmentUtils.assignAppropriateValue(tripleJValue, evaluationCommand.getResult(), tokenSign);
                }

            } else {
                if (!tripleJValue.isFinal()) {
                    if (this.tokenSign == TripleJLexer.ADD_ASSIGN) {
                        AssignmentUtils.addAssignAppropriateValue(tripleJValue, evaluationCommand.getStringResult());
                    }
                    else {
                        AssignmentUtils.assignAppropriateValue(tripleJValue, evaluationCommand.getStringResult());
                    }
                }
            }
        }
    }

    private boolean isLeftHandArrayAccessor() {
        List<TerminalNode> lBrackTokens = this.leftHandExprCtx.getTokens(TripleJLexer.LBRACK);
        List<TerminalNode> rBrackTokens = this.leftHandExprCtx.getTokens(TripleJLexer.RBRACK);

        return(lBrackTokens.size() > 0 && rBrackTokens.size() > 0);
    }

    private void handleArrayAssignment(String resultString) {
        TerminalNode identifierNode = this.leftHandExprCtx.expression(0).primary().Identifier();
        TripleJParser.ExpressionContext arrayIndexExprCtx = this.leftHandExprCtx.expression(1);

        TripleJValue tripleJValue = VariableSearcher.searchVariable(identifierNode.getText());
        TripleJArray tripleJArray = (TripleJArray) tripleJValue.getValue();

        EvaluationCommand evaluationCommand = new EvaluationCommand(arrayIndexExprCtx);
        evaluationCommand.execute();

        ExecutionManager.getInstance().setCurrentCheckedLineNumber(identifierNode.getSymbol().getLine());

        //create a new array value to replace value at specified index
        TripleJValue newArrayValue = new TripleJValue(null, tripleJArray.getPrimitiveType());
        newArrayValue.setValue(resultString);
        tripleJArray.updateValueAt(newArrayValue, evaluationCommand.getResult().intValue());

        //Console.log("Index to access: " +evaluationCommand.getResult().intValue()+ " Updated with: " +resultString);
    }
}
