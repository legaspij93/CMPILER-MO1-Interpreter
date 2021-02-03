package interpreter.commands;

import antlr.TripleJLexer;
import antlr.TripleJParser;
import interpreter.mapping.INTValueMapper;
import interpreter.mapping.IdentifierMapper;
import interpreter.representations.TripleJValue;
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


        INTValueMapper leftHandMapper = new IdentifierMapper(
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
            int value = Integer.parseInt(tripleJValue.getVal().toString());

            if(this.tokenSign == TripleJLexer.INC) {
                value++;
                tripleJValue.setVal(String.valueOf(value));
            }
            else if(this.tokenSign == TripleJLexer.DEC) {
                value--;
                tripleJValue.setVal(String.valueOf(value));
            }
        }
        else if(tripleJValue.getPrimitiveType() == TripleJValue.PrimitiveType.FLOAT) {
            float value = Float.parseFloat(tripleJValue.getVal().toString());

            if(this.tokenSign == TripleJLexer.INC) {
                value++;
                tripleJValue.setVal(String.valueOf(value));
            }
            else if(this.tokenSign == TripleJLexer.DEC) {
                value--;
                tripleJValue.setVal(String.valueOf(value));
            }
        }
    }

    public String getIdentifierString() {
        return exprCtx.primary().Identifier().getText();
    }
}
