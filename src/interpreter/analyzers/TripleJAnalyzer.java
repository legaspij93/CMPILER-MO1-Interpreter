package interpreter.analyzers;

import grammar.TripleJLexer;
import grammar.TripleJParser;
import interpreter.symboltable.SymbolTableManager;
import interpreter.utils.IdentifiedTokens;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Triple;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

public class TripleJAnalyzer implements ParseTreeListener {
    private TripleJScope scope;
    private IdentifiedTokenHolder identifiedTokenHolder;

    public final static String ACCESS_CONTROL_KEY = "ACCESS_CONTROL_KEY";
    public final static String CONST_CONTROL_KEY = "CONST_CONTROL_KEY";
    public final static String STATIC_CONTROL_KEY = "STATIC_CONTROL_KEY";
    public final static String PRIMITIVE_TYPE_KEY =  "PRIMITIVE_TYPE_KEY";
    public final static String IDENTIFIER_KEY = "IDENTIFIER_KEY";
    public final static String IDENTIFIER_VALUE_KEY = "IDENTIFIER_VALUE_KEY";

    public TripleJAnalyzer(){

    }

    public void analyze(TripleJParser.StartContext ctx){
        this.scope = SymbolTableManager.getInstance().getClassScope();
        this.scope.reset();
        this.identifiedTokenHolder = new IdentifiedTokenHolder();

        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(this, ctx);
    }

    @Override
    public void visitTerminal(TerminalNode node){

    }

    @Override
    public void visitErrorNode(ErrorNode node){

    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx){
        this.analyzeClassMembers(ctx);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx){

    }

    private void analyzeClassMembers(ParserRuleContext ctx){
        if(ctx instanceof TripleJParser.FieldDeclarationContext){
            TripleJParser.FieldDeclarationContext fieldCtx = (TripleJParser.FieldDeclarationContext) ctx;

            if(fieldCtx.typeType() != null){
                TripleJParser.TypeTypeContext typeCtx = fieldCtx.typeType();

                if(TripleJAnalyzer.isPrimitiveDeclaration(typeCtx)){
                    TripleJParser.PrimitiveTypeContext primitiveTypeCtx = typeCtx.primitiveType();
                    this.identifiedTokenHolder.addToken(PRIMITIVE_TYPE_KEY, primitiveTypeCtx.getText());

                    FieldAnalyzer fieldAnalyzer = new FieldAnalyzer(this.identifiedTokenHolder, this.scope);
                    fieldAnalyzer.analyze(fieldCtx.variableDeclarators());

                    this.identifiedTokenHolder.clearTokens();
                }
                else if(TripleJAnalyzer.isPrimitiveArrayDeclaration(typeCtx)){
                    ArrayAnalyzer arrayAnalyzer = new ArrayAnalyzer(this.identifiedTokenHolder, this.scope);
                    arrayAnalyzer.analyze(fieldCtx);
                }
                else{
                    if(typeCtx.classOrInterfaceType().getText().contains(KeywordRecognizer.PRIMITIVE_TYPE_STRING)){
                        TripleJParser.ClassOrInterfaceTypeContext classInterfaceCtx = typeCtx.classOrInterfaceType();
                        this.identifiedTokenHolder.addToken(PRIMITIVE_TYPE_KEY, classInterfaceCtx.getText());
                    }

                    FieldAnalyzer fieldAnalyzer = new FieldAnalyzer(this.identifiedTokenHolder, this.scope);
                    fieldAnalyzer.analyze(fieldCtx.variableDeclarators());

                    this.identifiedTokenHolder.clearTokens();
                }


            }
        }
        else if(ctx instanceof TripleJParser.MethodDeclarationContext){
            TripleJParser.MethodDeclarationContext methodDecCtx = (TripleJParser.MethodDeclarationContext) ctx;
            FunctionAnalyzer functionAnalyzer = new FunctionAnalyzer(this.identifiedTokenHolder, this.scope);
            functionAnalyzer.analyze(methodDecCtx);

            this.identifiedTokenHolder.clearTokens();
        }
    }

    public static boolean isPrimitiveDeclaration(TripleJParser.TypeTypeContext typeCtx){
        if(typeCtx.primitiveType() != null){
            List<TerminalNode> lBrackToken = typeCtx.getTokens(TripleJLexer.LBRACK);
            List<TerminalNode> rBrackToken = typeCtx.getTokens(TripleJLexer.RBRACK);

            return (lBrackToken.size() == 0 && rBrackToken.size() == 0);
        }

        return false;
    }

    public static boolean isPrimitiveArrayDeclaration(TripleJParser.TypeTypeContext typeCtx){
        if(typeCtx.primitiveType() != null){
            List<TerminalNode> lBrackToken = typeCtx.getTokens(TripleJLexer.LBRACK);
            List<TerminalNode> rBrackToken = typeCtx.getTokens(TripleJLexer.RBRACK);

            return (lBrackToken.size() > 0 && rBrackToken.size() > 0);
        }

        return false;
    }
}
