package commands;

import antlr.TripleJParser;
import items.TripleJValue;

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
            value = StringUtilities.removeQuotes(this.modifiedExp);
            tripleJValue.setPrimitiveType(TripleJValue.PrimitiveType.STRING);
            tripleJValue.setValue(value);
        }else if(this.modifiedExp.contains("'")){
            value = StringUtilities.removeQuotes(this.modifiedExp);
            tripleJValue.setPrimitiveType(TripleJValue.PrimitiveType.CHAR);
            tripleJValue.setValue(value);
        }
        else {
            evaluationCommand = new EvaluationCommand(this.parentExprCtx);
            evaluationCommand.execute();
            AssignmentUtilities.assignAppropriateValue(tripleJValue, evaluationCommand.getResult());
        }

    }

    /*
     * Returns the modified exp, with mapped values.
     */
    public String getModifiedExp() {
        return this.modifiedExp;
    }
}
