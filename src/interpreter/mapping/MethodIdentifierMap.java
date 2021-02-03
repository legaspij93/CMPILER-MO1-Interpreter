package interpreter.mapping;

import interpreter.commands.EvaluationCommand;
import interpreter.representations.TripleJArray;
import interpreter.representations.TripleJFunction;
import interpreter.representations.TripleJValue;
import interpreter.representations.TripleJValueSearcher;
import interpreter.symboltable.ClassScope;
import interpreter.symboltable.LocalScope;
import interpreter.symboltable.LocalScopeCreate;
import interpreter.symboltable.SymbolTableManager;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import antlr.TripleJParser;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MethodIdentifierMap implements ParseTreeListener, INTValueMapper {
    private final static String TAG = "MobiProg_FunctionIdentifierMapper";

    private String originalExp = null;
    private String modifiedExp = null;

    private TripleJFunction assignedFunction;
    private TripleJValue tripleJValue;
    private LocalScope functionLocalScope;

    public MethodIdentifierMap(String originalExp, TripleJFunction assignedFunction) {
        this.originalExp = originalExp;
        this.modifiedExp = originalExp;
        this.assignedFunction = assignedFunction;
        this.functionLocalScope = assignedFunction.getParentLocalScope();
    }

    public void analyze(TripleJParser.ExpressionContext exprCtx) {
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(this, exprCtx);
    }

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
        if(ctx instanceof TripleJParser.PrimaryContext) {
            TripleJParser.PrimaryContext primaryCtx = (TripleJParser.PrimaryContext) ctx;

            if(primaryCtx.Identifier() != null) {
                String variableKey = primaryCtx.getText();

                if (!EvaluationCommand.isArray(variableKey))
                    this.searchVariable(variableKey);
            }
        } else if (ctx instanceof TripleJParser.ExpressionContext) {

            TripleJParser.ExpressionContext exprCtx = (TripleJParser.ExpressionContext) ctx;

            if (exprCtx.expression().size() == 2) {
                if (EvaluationCommand.isArray(exprCtx.expression(0))) {
                    searchArray(exprCtx);
                }
            }

        }
    }

    private void searchVariable(String identifierString) {
        if(this.assignedFunction.hasParameter(identifierString)) {
            this.modifiedExp = this.modifiedExp.replace(identifierString, this.assignedFunction.getParameter(identifierString).getValue().toString());
        }
        else {
            this.tripleJValue = LocalScopeCreate.searchVariableInLocalIterative(identifierString, this.functionLocalScope);

            if(this.tripleJValue != null) {
                this.modifiedExp = this.modifiedExp.replace(identifierString, this.tripleJValue.getVal().toString());
            }
            else {
                ClassScope classScope = SymbolTableManager.getInstance().getClassScope(ParserHandler.getInstance().getCurrentClassName());
                this.tripleJValue = classScope.searchVariableIncludingLocal(identifierString);

                //Console.log("Variable in global scope: " +this.mobiValue.getValue());
                this.modifiedExp = this.modifiedExp.replace(identifierString, this.tripleJValue.getVal().toString());
            }
        }
    }

    private void searchArray(TripleJParser.ExpressionContext exprCtx) {
        TripleJValue value = TripleJValueSearcher.searchBaracoValue(exprCtx.expression(0).getText());

        if (value != null) {
            if (value.getPrimitiveType() == TripleJValue.PrimitiveType.ARRAY) {

                TripleJArray tripleJArray = (TripleJArray) value.getVal();

                EvaluationCommand evCmd = new EvaluationCommand(exprCtx.expression(1));
                evCmd.execute();

                ExecutionManager.getInstance().setCurrentCheckedLineNumber(exprCtx.getStart().getLine());
                TripleJValue tripleJValue = tripleJArray.getValueAt(evCmd.getResult().intValue());

                if (tripleJValue == null)
                    return;

                if (tripleJValue.getPrimitiveType() == TripleJValue.PrimitiveType.STRING) {
                    this.modifiedExp = this.modifiedExp.replace(exprCtx.getText(), "\"" + tripleJValue.getVal().toString() + "\"");
                } else {
                    this.modifiedExp = this.modifiedExp.replace(exprCtx.expression(0).getText() + "[" + evCmd.getResult().intValue() + "]", tripleJValue.getValue().toString());
                }

            }
        }

    }

    @Override
    public TripleJValue getValue() {
        return this.tripleJValue;
    }

    @Override
    public String getOriginalExp() {
        return this.originalExp;
    }

    @Override
    public String getModifiedExp() {
        return this.modifiedExp;
    }
}