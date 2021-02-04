package interpreter.commands;

import antlr.TripleJParser;
import com.udojava.evalex.Expression;
import grammar.TripleJParser;
import interpreter.representations.TripleJFunction;
import interpreter.representations.TripleJValue;
import interpreter.symboltable.SymbolTableManager;
import interpreter.symboltable.TripleJScope;
import interpreter.utils.StringUtils;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import interpreter.utils.StringUtils;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.math.BigDecimal;
import java.util.List;
import java.util.regex.Pattern;

public class EvaluationCommand implements INTCommand, ParseTreeListener {
    private TripleJParser.ConditionalExpressionContext expressionContext;
    private String modifiedExp;
    private BigDecimal resultValue;

    public EvaluationCommand(TripleJParser.ConditionalExpressionContext expCtx){
        this.expressionContext = expCtx;
    }

    @Override
    public void execute() {
        this.modifiedExp = this.parentExprCtx.getText();
        //System.out.println("MODDYY: "+modifiedExp);
        //catch rules if the value has direct boolean flags
        /*if(this.modifiedExp.contains(KeywordRecognizer.BOOLEAN_TRUE)) {
            this.resultValue = new BigDecimal(1);
        }
        else if(this.modifiedExp.contains(KeywordRecognizer.BOOLEAN_FALSE)) {
            this.resultValue = new BigDecimal(0);
        } */
        if (this.modifiedExp.contains(KeywordRecognizer.BOOLEAN_TRUE)||this.modifiedExp.contains(KeywordRecognizer.BOOLEAN_FALSE)){
            try {
                this.resultValue = new BigDecimal(evaluateBoolean(this.modifiedExp));
            } catch (ScriptException e) {
                e.printStackTrace();
            }
        }
        else {
            ParseTreeWalker treeWalker = new ParseTreeWalker();
            treeWalker.walk(this, this.parentExprCtx);

            Expression evalEx = new Expression(this.modifiedExp);
            //Log.i(TAG,"Modified exp to eval: " +this.modifiedExp);
            this.resultValue = evalEx.eval();
        }

    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        if (ctx instanceof TripleJParser.ExpressionContext) {
            TripleJParser.ExpressionContext exprCtx = (TripleJParser.ExpressionContext) ctx;
            if (EvaluationCommand.isFunctionCall(exprCtx)) {
                this.evaluateFunctionCall(exprCtx);
            } else if(SymbolTableManager.getInstance().getCorgiScope().getFunction(exprCtx.getText()) != null){

            }
            else if (EvaluationCommand.isVariableOrConst(exprCtx)) {
                this.evaluateVariable(exprCtx);
            }
        }
    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }

    public static boolean isFunctionCall(TripleJParser.ExpressionContext exprCtx) {
        Pattern functionPattern = Pattern.compile("([a-zA-Z0-9]+)\\(([ ,.a-zA-Z0-9]*)\\)");

        if (exprCtx.expressionList() != null || functionPattern.matcher(exprCtx.getText()).matches()) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isVariableOrConst(TripleJParser.ExpressionContext exprCtx) {
        if (exprCtx.primary() != null && exprCtx.primary().Identifier() != null) {
            return true;
        } else {
            return false;
        }
    }

    private void evaluateFunctionCall(TripleJParser.ExpressionContext exprCtx) {
        String functionName = exprCtx.expression(0).getText();

        TripleJScope tripleJScope = SymbolTableManager.getInstance().getTripleJScope();
        TripleJFunction tripleJFunction = tripleJScope.getFunction(functionName);

        if (exprCtx.expressionList() != null) {
            List<TripleJParser.ExpressionContext> exprCtxList = exprCtx.expressionList().expression();

            for (int i = 0; i < exprCtxList.size(); i++) {
                TripleJParser.ExpressionContext parameterExprCtx = exprCtxList.get(i);

                EvaluationCommand evaluationCommand = new EvaluationCommand(parameterExprCtx);
                evaluationCommand.execute();

                tripleJFunction.mapParameterByValueAt(evaluationCommand.getResult().toEngineeringString(), i);
            }
        }

        tripleJFunction.execute();

//        Log.i(TAG, "Before modified EXP function call: " +this.modifiedExp);
        this.modifiedExp = this.modifiedExp.replace(exprCtx.getText(),
                tripleJFunction.getReturnValue().getValue().toString());
//        Log.i(TAG, "After modified EXP function call: " +this.modifiedExp);

    }

    private void evaluateVariable(TripleJParser.ExpressionContext exprCtx) {
        TripleJValue tripleJValue = VariableSearcher
                .searchVariable(exprCtx.getText());
        this.modifiedExp = this.modifiedExp.replaceFirst(exprCtx.getText(),
                tripleJValue.getValue().toString());
    }

    public BigDecimal getResult(){return this.resValue;}

    private int evaluateBoolean (String exp) throws ScriptException {
        String temp = exp;
        exp.replace("&&", "*");
        exp.replace("||", "+");

        String stringTemp;

        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");

        //System.out.println(engine.eval(exp).toString());
        stringTemp = engine.eval(exp).toString();
        // System.out.println(engine.eval(exp));

        if (stringTemp.equals("false"))
            return 0;
        else
            return 1;


    }
}
