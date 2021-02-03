package interpreter.mapping;
import antlr.TripleJParser;
import interpreter.representations.TripleJValue;

public interface INTValueMapper {
    public abstract void analyze(TripleJParser.ExpressionContext exprCtx);
    public abstract void analyze(TripleJParser.ParExpressionContext exprCtx);
    public abstract String getOriginalExp();
    public abstract String getModifiedExp();
    public abstract TripleJValue getBaracoValue();
}
