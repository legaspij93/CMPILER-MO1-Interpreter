package commands;

import antlr.TripleJLexer;
import antlr.TripleJParser;
import execution.ExecutionManager;
import interpreter.commands.EvaluationCommand;
import interpreter.errorChecker.TypeChecker;
import interpreter.representations.TripleJValue;
import items.TripleJArray;
import items.TripleJValue;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

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

        if(this.isLeftHandArrayAccessor()) {
            this.handleArrayAssignment(evaluationCommand.getResult().toEngineeringString());
        }
        else {
            TripleJValue tripleJValue = VariableSearcher.searchVariable(this.leftHandExprCtx.getText());
            AssignmentUtilities.assignAppropriateValue(tripleJValue, evaluationCommand.getResult());
        }
    }

    private boolean isLeftHandArrayAccessor() {
        List<TerminalNode> lBrackTokens = this.leftHandExprCtx.getTokens(CorgiLexer.LBRACK);
        List<TerminalNode> rBrackTokens = this.leftHandExprCtx.getTokens(CorgiLexer.RBRACK);

        return(lBrackTokens.size() > 0 && rBrackTokens.size() > 0);
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
        TripleJArray tripleJArray = (TripleJArray) tripleJValue.getValue();

        EvaluationCommand evaluationCommand = new EvaluationCommand(arrayIndexExprCtx);
        evaluationCommand.execute();

        ExecutionManager.getInstance().setCurrentCheckedLineNumber(arrayIndexExprCtx.getStart().getLine());

        //create a new array value to replace value at specified index
        TripleJValue newArrayValue = new TripleJValue(null, tripleJArray.getPrimitiveType());
        newArrayValue.setValue(resultString);
        tripleJArray.updateValueAt(newArrayValue, evaluationCommand.getResult().intValue());

        //Console.log("Index to access: " +evaluationCommand.getResult().intValue()+ " Updated with: " +resultString);
    }

}