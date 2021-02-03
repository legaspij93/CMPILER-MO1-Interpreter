package commands;

import antlr.TripleJLexer;
import antlr.TripleJParser;
import items.TripleJValue;

public class IncDecCommand implements INTCommand {

    private TripleJParser.ExpressionContext exprCtx;
    private int tokenSign;

    public IncDecCommand(TripleJParser.ExpressionContext exprCtx, int tokenSign) {
        this.exprCtx = exprCtx;
        this.tokenSign = tokenSign;

        ConstChecker constChecker = new ConstChecker(this.exprCtx);
        constChecker.verify();

        UndeclaredChecker undeclaredChecker = new UndeclaredChecker(this.exprCtx);
        undeclaredChecker.verify();
    }

    @Override
    public void execute() {


        IValueMapper leftHandMapper = new IdentifierMapper(
                this.exprCtx.getText());
        leftHandMapper.analyze(this.exprCtx);

        TripleJValue tripleJValue = leftHandMapper.getValue();

        if(!tripleJValue.isFinal())
            this.performOperation(tripleJValue);
    }

    /*
     * Attempts to perform an increment/decrement operation
     */
    private void performOperation(TripleJValue tripleJValue) {
        if(tripleJValue.getPrimitiveType() == TripleJValue.PrimitiveType.INT) {
            int value = Integer.parseInt(tripleJValue.getValue().toString());

            if(this.tokenSign == TripleJLexer.INC) {
                value++;
                tripleJValue.setValue(String.valueOf(value));
            }
            else if(this.tokenSign == TripleJLexer.DEC) {
                value--;
                tripleJValue.setValue(String.valueOf(value));
            }
        }
        else if(tripleJValue.getPrimitiveType() == TripleJValue.PrimitiveType.FLOAT) {
            float value = Float.parseFloat(tripleJValue.getValue().toString());

            if(this.tokenSign == TripleJLexer.INC) {
                value++;
                tripleJValue.setValue(String.valueOf(value));
            }
            else if(this.tokenSign == TripleJLexer.DEC) {
                value--;
                tripleJValue.setValue(String.valueOf(value));
            }
        }
    }

    public String getIdentifierString() {
        return exprCtx.primary().Identifier().getText();
    }
}
