package interpreter.builder;

import grammar.TripleJBaseListener;
import grammar.TripleJLexer;
import grammar.TripleJParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class ParserHandler {
    private static ParserHandler sharedInstance = null;

    public static ParserHandler getInstance(){
        if(sharedInstance == null)
            sharedInstance = new ParserHandler();

        return sharedInstance;
    }

    private TripleJLexer tripleJLexer;
    private TripleJParser tripleJParser;

    private String currentClassName; //the current class being parsed

    private ParserHandler() {

    }

    public void parseText(String textToParse) throws IOException {
        InputStream stream = new ByteArrayInputStream(textToParse.getBytes(StandardCharsets.UTF_8));
        CharStream charStream = CharStreams.fromStream(stream);
        this.tripleJLexer = new TripleJLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(this.tripleJLexer);
        this.tripleJParser = new TripleJParser(tokens);
        this.tripleJParser.removeErrorListeners();
        this.tripleJParser.addErrorListener(BuildChecker.getInstance());

        ParserRuleContext parserRuleContext = this.tripleJParser.start();

        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(new TripleJBaseListener(), parserRuleContext);
    }
}
