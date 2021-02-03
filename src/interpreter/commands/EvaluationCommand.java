package commands;

import antlr.TripleJParser;
import com.udojava.evalex.Expression;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import utils.StringUtils;

import java.math.BigDecimal;
import java.util.List;
import java.util.regex.Pattern;

public class EvaluationCommand implements INTCommand, ParseTreeListener {
    private TripleJParser.ConditionalExpressionContext expressionContext;
    private String newExp;
    private BigDecimal resValue;
    private String result = "";

    private Boolean isNumeric;
    private Boolean hasException = false;

    public EvaluationCommand(TripleJParser.ConditionalExpressionContext expCtx){
        this.expressionContext = expCtx;
    }

    @Override
    public void execute(){
        this.newExp = this.expressionContext.getText();

        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(this,this.expressionContext);

        isNumeric = !this.newExp.contains("\"") && this.newExp.contains("\'");

        if(!isNumeric){
            if(this.newExp.contains("==") || this.newExp.contains("!=")){
                String[] strings = {"", ""};

                if(this.newExp.contains("=="))
                    strings = this.newExp.split("==");
                if(this.newExp.contains("!="))
                    strings = this.newExp.split("!=");

                String equal = "STREQ("+strings[0]+", " + strings[1] + ")";
                if (this.newExp.contains("!="))
                    equal = "not(" + equal + ")";

                Expression e = new Expression(equal);

                e.addLazyFunction(e.new LazyFunction("STREQ", 2) {

                    private Expression.LazyNumber ZERO = new Expression.LazyNumber() {
                        @Override
                        public BigDecimal eval() {
                            return BigDecimal.ZERO;
                        }

                        @Override
                        public String getString() {
                            return "0";
                        }
                    };

                    private Expression.LazyNumber ONE = new Expression.LazyNumber() {
                        @Override
                        public BigDecimal eval() {
                            return BigDecimal.ONE;
                        }

                        @Override
                        public String getString() {
                            return "1";
                        }
                    };

                    @Override
                    public Expression.LazyNumber lazyEval(List<Expression.LazyNumber> lazyList) {
                        if(lazyList.get(0).getString().equals(lazyList.get(1).getString())){
                            return ONE;
                        }
                        return ZERO;
                    }
                });

                this.resValue = e.eval();
                isNumeric = true;
                } else if(this.newExp.contains("<=") || this.newExp.contains(">=") || this.newExp.contains("<") || this.newExp.contains(">")){
                Expression e = new Expression(this.newExp);

                this.resValue = e.eval();
                isNumeric = true;
            }
            else {
                this.result = StringUtils.removeQuotes(newExp);
            }
            } else {
            if(this.newExp.contains("!")){
                this.newExp = this.newExp.replaceAll("!", "not");
                this.newExp = this.newExp.replaceAll("not=", "!=");
            }
            if(this.newExp.contains("and")){
                this.newExp = this.newExp.replaceAll("and", "&&");
            }
            if(this.newExp.contains("or")){
                this.newExp = this.newExp.replaceAll("or", "||");
            }
            Expression evalEx = new Expression(this.newExp);

            try{
                this.resValue = evalEx.eval(false);
                this.result = this.resValue.toEngineeringString();
            }catch (Expression.ExpressionException exp){

                this.resValue = new BigDecimal(0);
                this.result = "";
                this.hasException = true;

            }catch (ArithmeticException exp){
                //Add execution Manager here

                this.resValue = new BigDecimal(0);
                this.result = "";
                this.hasException = true;
            }
        }
    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext){
        if(parserRuleContext instanceof TripleJParser.ConditionalExpressionContext){
            TripleJParser.ConditionalExpressionContext condCtx = (TripleJParser.ConditionalExpressionContext) parserRuleContext;
            if(EvaluationCommand.isFunctionCall(condCtx)){
                this.evaluateFunctionCall(condCtx);
            }
            else if(EvaluationCommand.isVariableOrConst(condCtx)){
                this.evaluateFunctionCall(condCtx);
            }
        }
    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }

    public static boolean isFunctionCall(TripleJParser.ConditionalExpressionContext ctx){
        Pattern functionPattern = Pattern.compile("([a-zA-Z0-9]+)\\(([ ,.a-zA-Z0-9]*)\\)");

        if(functionPattern.matcher(ctx.getText()).matches())
            return true;
        else
            return false;
    }

    public static boolean isVariableOrConst(TripleJParser.ConditionalExpressionContext ctx){
        //Have to check if valid to just go the first part or needed to be in the most inner level

        //placeholder
        return true;

    }

    private void evaluateFunctionCall(TripleJParser.ConditionalExpressionContext ctx){

    }
    private void evaluateVariable(TripleJParser.ConditionalExpressionContext ctx){

    }

    public BigDecimal getResult(){return this.resValue;}
    public String getStringResult(){return result;}
    public boolean isNumberResult(){return isNumeric;}
    public boolean hasException(){return hasException;}

}
