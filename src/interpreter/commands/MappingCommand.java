package interpreter.commands;

import antlr.TripleJParser;
import interpreter.representations.TripleJValue;
import interpreter.utils.AssignmentUtils;
import interpreter.utils.StringUtils;
import items.TripleJValue;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class MappingCommand implements INTCommand{

    private String identifierString;
    private TripleJParser.ExpressionContext parentExprCtx;

    private String modifiedExp;

    public MappingCommand(String identifierString, TripleJParser.ExpressionContext exprCtx) {
        this.identifierString = identifierString;
        this.parentExprCtx = exprCtx;

        UndeclaredChecker undeclaredChecker = new UndeclaredChecker(this.parentExprCtx);
        undeclaredChecker.verify();

        ParseTreeWalker functionWalker = new ParseTreeWalker();
        functionWalker.walk(new FunctionCallVerifier(), this.parentExprCtx);

    }


    @Override
    public void execute() {
        this.modifiedExp = this.parentExprCtx.getText();
        System.out.println("Executing Mapping Command");
        String value = "";
        EvaluationCommand evaluationCommand;
        TripleJValue tripleJValue = VariableSearcher.searchVariable(this.identifierString);
        if(this.modifiedExp.contains("\"")) {
            value = StringUtils.removeQuotes(this.modifiedExp);
            tripleJValue.setPrimitiveType(TripleJValue.PrimitiveType.STRING);
            tripleJValue.setVal(value);
        }else if(this.modifiedExp.contains("'")){
            value = StringUtils.removeQuotes(this.modifiedExp);
            tripleJValue.setPrimitiveType(TripleJValue.PrimitiveType.CHAR);
            tripleJValue.setVal(value);
        }
        else {
            evaluationCommand = new EvaluationCommand(this.parentExprCtx);
            evaluationCommand.execute();
            AssignmentUtils.assignAppropriateValue(tripleJValue, evaluationCommand.getResult());
        }

    }

    public String getModifiedExp() {
        return this.modifiedExp;
    }

    public String getIdentifierString() {
        return identifierString;
    }

    public TripleJParser.ExpressionContext getParentExprCtx() {
        return parentExprCtx;
    }
}
