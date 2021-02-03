package commands;

import antlr.TripleJParser;
import com.udojava.evalex.Expression;

import java.math.BigDecimal;

public class EvaluateCondition {
    public static boolean evaluateCond(TripleJParser.ConditionalExpressionContext expressionContext){
        if(expressionContext.getText().contains("true")){
            return true;
        }
        else if(expressionContext.getText().contains("false")){
            return false;
        }

        EvaluationCommand evaluate = new EvaluationCommand(expressionContext);
        evaluate.execute();

        int result = evaluate.getResult().intValue();

        return(result==1);
    }

    public static boolean evaluateCond(String cond){
        if(cond.contains("(true)"))
            return true;
        else if(cond.contains("(false)"))
            return false;

        if (cond.contains("!")) {
            cond = cond.replaceAll("!", "not");
            cond = cond.replaceAll("not=", "!=");
        }

        if(cond.contains("and"))
            cond = cond.replaceAll("and", "&&");

        if(cond.contains("or"))
            cond = cond.replaceAll("or", "||");

        Expression expression = new Expression(cond);
        BigDecimal result = expression.eval();

        return (1 == Integer.parseInt(result.toEngineeringString()));
    }

}
