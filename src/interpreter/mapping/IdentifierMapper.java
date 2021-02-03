package interpreter.mapping;
import antlr.TripleJParser;
import interpreter.representations.TripleJValue;

public class IdentifierMapper implements INTValueMapper{
    private final static String TAG = "IdentifierMapper";

    private INTValueMapper valueMapper;

    public IdentifierMapper(String originalExp) {
        if(MethodTracker.getInstance().isInsideFunction()) {
            this.valueMapper = new MethodIdentifierMapper(originalExp, MethodTracker.getInstance().getLatestFunction());
        }
        else {
            this.valueMapper = new ClassIdentifierMapper(originalExp);
        }
    }

    @Override
    public void analyze(TripleJParser.ExpressionContext exprCtx) {
        this.valueMapper.analyze(exprCtx);
    }

    @Override
    public void analyze(TripleJParser.ParExpressionContext exprCtx) {
        this.valueMapper.analyze(exprCtx);
    }

    @Override
    public String getOriginalExp() {
        return this.valueMapper.getOriginalExp();
    }

    @Override
    public String getModifiedExp() {
        return this.valueMapper.getModifiedExp();
    }

    @Override
    public TripleJValue getBaracoValue() {
        return this.valueMapper.getBaracoValue();
    }
}
