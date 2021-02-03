package interpreter.mapping;

import interpreter.representations.TripleJValue;
import interpreter.symboltable.ClassScope;
import interpreter.symboltable.SymbolTableManager;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import antlr.TripleJParser;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ClassIdentifierMap implements ParseTreeListener, INTValueMapper {

    private TripleJValue baracoValue;
    private String originalExp = null;
    private String modifiedExp = null;

    public ClassIdentifierMap(String originalExp) {
        this.originalExp = originalExp;
        this.modifiedExp = originalExp;
    }

    /* (non-Javadoc)
     * @see com.neildg.mobiprog.semantics.mapping.IValueMapper#analyze(com.neildg.mobiprog.generatedexp.JavaParser.ExpressionContext)
     */
    @Override
    public void analyze(TripleJParser.ExpressionContext exprCtx) {
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(this, exprCtx);
    }

    /* (non-Javadoc)
     * @see com.neildg.mobiprog.semantics.mapping.IValueMapper#analyze(com.neildg.mobiprog.generatedexp.JavaParser.ParExpressionContext)
     */
    @Override
    public void analyze(TripleJParser.ParExpressionContext exprCtx) {
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(this, exprCtx);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        if (ctx instanceof TripleJParser.PrimaryContext) {
            TripleJParser.PrimaryContext primaryCtx = (TripleJParser.PrimaryContext) ctx;

            if (primaryCtx.Identifier() != null) {
                String variableKey = primaryCtx.getText();
                ClassScope classScope = SymbolTableManager.getInstance().getClassScope(ParserHandler.getInstance().getCurrentClassName());

                this.baracoValue = classScope.searchVariableIncludingLocal(variableKey);
                this.modifiedExp = this.modifiedExp.replace(variableKey, this.baracoValue.getValue().toString());
            }
        }
    }

    @Override
    public TripleJValue getValue() {
        return this.baracoValue;
    }

    /* (non-Javadoc)
     * @see com.neildg.mobiprog.semantics.mapping.IValueMapper#getOriginalExp()
     */
    @Override
    public String getOriginalExp() {
        return this.originalExp;
    }

    /* (non-Javadoc)
     * @see com.neildg.mobiprog.semantics.mapping.IValueMapper#getModifiedExp()
     */
    @Override
    public String getModifiedExp() {
        return this.modifiedExp;
    }
}

