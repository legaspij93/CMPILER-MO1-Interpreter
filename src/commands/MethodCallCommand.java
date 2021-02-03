package commands;

import antlr.TripleJParser;
import items.TripleJMethod;
import items.TripleJValue;
import symbolTable.Scope;
import symbolTable.SymbolTableManager;

import java.util.List;

public class MethodCallCommand implements INTCommand {
    private final static String TAG = "MobiProg_FunctionCallCommand";

    private TripleJMethod tripleJMethod;
    private TripleJParser.ExpressionContext exprCtx;
    private String functionName;

    public MethodCallCommand(String functionName, TripleJParser.ExpressionContext exprCtx) {
        this.functionName = functionName;
        this.exprCtx = exprCtx;

        System.out.println("SEARCH FOR " + functionName);

        this.searchFunction();

        ParseTreeWalker functionWalker = new ParseTreeWalker();
        functionWalker.walk(new MethodCallVerifier(), this.exprCtx);

        this.verifyParameters();
    }


    @Override
    public void execute() {
        this.mapParameters();
        this.tripleJMethod.execute();
    }

    private void searchFunction() {
        Scope classScope = SymbolTableManager.getInstance().getClassScope(ParserHandler.getInstance().getCurrentClassName());
        this.tripleJMethod = classScope.searchMethod(this.functionName);
    }

    private void verifyParameters() {
        if(this.exprCtx.arguments() == null || this.exprCtx.arguments().expressionList() == null
                || this.exprCtx.arguments().expressionList().expression() == null) {
            return;
        }

        List<TripleJParser.ExpressionContext> exprCtxList = this.exprCtx.arguments().expressionList().expression();
        //map values in parameters
        for(int i = 0; i < exprCtxList.size(); i++) {
            TripleJParser.ExpressionContext parameterExprCtx = exprCtxList.get(i);
            this.tripleJMethod.verifyParameterByValueAt(parameterExprCtx, i);
        }
    }

    /*
     * Maps parameters when needed
     */
    private void mapParameters() {
        System.out.println("MethodCallCommand: mapping parameters");
        //System.out.println("exprctx: " + this.exprCtx.expressionList().getText());
        /*if(this.exprCtx.arguments() == null || this.exprCtx.arguments().expressionList() == null
                || this.exprCtx.arguments().expressionList().expression() == null) {
            return;
        }*/

        if (this.exprCtx.expressionList() == null) {
            return;
        }

        List<TripleJParser.ExpressionContext> exprCtxList = this.exprCtx.expressionList().expression();

        //map values in parameters
        for(int i = 0; i < exprCtxList.size(); i++) {
            TripleJParser.ExpressionContext parameterExprCtx = exprCtxList.get(i);

            if(this.tripleJMethod.getParameterAt(i).getPrimitiveType() == TripleJValue.PrimitiveType.ARRAY) {
                TripleJValue baracoValue = VariableSearcher.searchVariable(parameterExprCtx.getText());
                this.tripleJMethod.mapArrayAt(baracoValue, i, parameterExprCtx.getText());
            }
            else {
                EvaluationCommand evaluationCommand = new EvaluationCommand(parameterExprCtx);
                evaluationCommand.execute();

                if (evaluationCommand.isNumericResult()) {
                    this.tripleJMethod.mapParameterByValueAt(evaluationCommand.getResult().toEngineeringString(), i);
                }
                else {
                    this.tripleJMethod.mapParameterByValueAt(evaluationCommand.getStringResult(), i);
                }
            }
        }
    }

    public TripleJValue getReturnValue() {
        return this.tripleJMethod.getReturnValue();
    }

}
