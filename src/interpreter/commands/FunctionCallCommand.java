package interpreter.commands;
import antlr.TripleJParser;
import interpreter.commands.INTCommand;
import execution.ExecutionManager;
import execution.ExecutionMonitor;
import interpreter.representations.TripleJFunction;
import interpreter.representations.TripleJValue;
import interpreter.utils.StringUtils;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import symbolTable.Scope;
import symbolTable.SymbolTableManager;

import java.util.List;

public class FunctionCallCommand implements INTCommand {

    private TripleJFunction tripleFunction;
    private TripleJParser.ExpressionContext exprCtx;
    private String functionName;

    public FunctionCallCommand(String functionName, TripleJParser.ExpressionContext exprCtx) {
        this.functionName = functionName;
        this.exprCtx = exprCtx;

        this.searchFunction();

        ParseTreeWalker functionWalker = new ParseTreeWalker();
        functionWalker.walk(new FunctionCallVerifier(), this.exprCtx);

        this.verifyParameters();
    }

    @Override
    public void execute() {
        this.mapParameters();
        this.tripleFunction.execute();
    }

    private void searchFunction() {
        Scope scope = SymbolTableManager.getInstance().getScope();
        this.tripleFunction = scope.getF(this.functionName);
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
            this.tripleFunction.verifyParameterByValueAt(parameterExprCtx, i);
        }
    }

    /*
     * Maps parameters when needed
     */
    private void mapParameters() {
//        System.out.println("Function Call: " + this.exprCtx.getText());
//        System.out.println("Arguments: " + this.exprCtx.expressionList().getText());

        if (this.exprCtx.expressionList() == null) {
            return;
        }

        List<TripleJParser.ExpressionContext> exprCtxList = this.exprCtx.expressionList().expression();

        //map values in parameters
        for(int i = 0; i < exprCtxList.size(); i++) {
            TripleJParser.ExpressionContext parameterExprCtx = exprCtxList.get(i);

            if(this.tripleFunction.getParameterAt(i).getPrimitiveType() == TripleJValue.PrimitiveType.ARRAY) {
                TripleJValue tripleValue = VariableSearcher.searchVariable(parameterExprCtx.getText());
                this.tripleFunction.mapArrayAt(tripleValue, i, parameterExprCtx.getText());
            } else if(parameterExprCtx.getText().contains("\"")){
                String param = StringUtils.removeQuotes(parameterExprCtx.getText());
                this.tripleFunction.mapParameterByValue(param);
            } else if(parameterExprCtx.getText().contains("'")){
                String param = StringUtils.removeQuotes(parameterExprCtx.getText());
                this.tripleFunction.mapParameterByValue(param);
            } else if(this.tripleFunction.getParameterAt(i).getPrimitiveType() != null){
                TripleJValue tripleJValue = VariableSearcher.searchVariable(parameterExprCtx.getText());
                this.tripleFunction.mapParameterByValue(TripleJValue.getValue().toString());
            }
            else {
                EvaluationCommand evaluationCommand = new EvaluationCommand(parameterExprCtx);
                evaluationCommand.execute();

                this.tripleFunction.mapParameterByValueAt(evaluationCommand.getResult().toEngineeringString(), i);
            }
        }
    }

    public TripleJValue getReturnValue() {
        return this.tripleFunction.getReturnValue();
    }
}
