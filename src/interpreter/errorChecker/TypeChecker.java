package interpreter.errorChecker;

import grammar.TripleJParser;
import interpreter.builder.BuildChecker;
import interpreter.builder.SemanticErrorDictionary;
import interpreter.representations.TripleJValue;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

public class TypeChecker implements IErrorChecker, ParseTreeListener {
    private TripleJValue value;
    private TripleJParser.ExpressionContext exprCtx;
    private int lnNum;

    public TypeChecker(TripleJValue assignmentVal, TripleJParser.ExpressionContext exprCtx){
        this.value = assignmentVal;
        this.exprCtx = exprCtx;

        Token firstToken = exprCtx.getStart();
        this.lnNum = firstToken.getLine();
    }

    @Override
    public void verify(){
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(this, this.exprCtx);
    }

    public static boolean isNumeric(String str){
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    @Override
    public void visitTerminal(TerminalNode node){

    }

    @Override
    public void visitErrorNode(ErrorNode node){

    }

    @Override
    public void entryEveryRule(ParserRuleContext ctx){
        if(ctx instanceof TripleJParser.LiteralContext){
            if(this.value == null)
                return;
            TripleJParser.LiteralContext literalCtx = (TripleJParser.LiteralContext) ctx;
            String expressionString = literalCtx.getText();

            if(this.value.getPrimitiveType() == TripleJValue.PrimitiveType.ARRAY){

            }
            else if(this.value.getPrimitiveType() == TripleJValue.PrimitiveType.BOOL){
                if(literalCtx.BooleanLiteral() == null){
                    String additionalMessage = "Expected boolean.";
                    BuildChecker.reportCustomError(SemanticErrorDictionary.TYPE_MISMATCH, additionalMessage, this.lnNum);
                }
            }
            else if(this.value.getPrimitiveType() == TripleJValue.PrimitiveType.INT){
                if(literalCtx.IntegerLiteral() == null){
                    String additionalMessage = "Expected int.";
                    BuildChecker.reportCustomError(SemanticErrorDictionary.TYPE_MISMATCH, additionalMessage, this.lnNum);
                }
            }
            else if(this.value.getPrimitiveType() == TripleJValue.PrimitiveType.FLOAT){
                if(literalCtx.FloatingPointLiteral() == null){
                    String additionalMessage = "Expected floating point or double.";
                    BuildChecker.reportCustomError(SemanticErrorDictionary.TYPE_MISMATCH, additionalMessage, this.lnNum);
                }
            }
            else if(this.value.getPrimitiveType() == TripleJValue.PrimitiveType.STRING){
                if(expressionString.charAt(0) != '\"' && expressionString.charAt(expressionString.length() - 1) != '\"'){
                    String additionalMessage = "Expected string.";
                    BuildChecker.reportCustomError(SemanticErrorDictionary.TYPE_MISMATCH, additionalMessage, this.lnNum);
                }
                else if(literalCtx.StringLiteral() == null){
                    String additionalMessage = "Expected string.";
                    BuildChecker.reportCustomError(SemanticErrorDictionary.TYPE_MISMATCH, additionalMessage, this.lnNum);
                }
            }
        }
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx){

    }
}
