package interpreter.commands;

import antlr.TripleJParser;
import items.TripleJArray;
import items.TripleJValue;

public class PrintCommand implements INTCommand, ParseTreeListener {

    private TripleJParser.ExpressionContext expressionCtx;

    private String statementToPrint = "";
    private boolean complexExpr = false;
    private boolean arrayAccess = false;

    public PrintCommand(TripleJParser.ExpressionContext expressionCtx) {
        this.expressionCtx = expressionCtx;

        UndeclaredChecker undeclaredChecker = new UndeclaredChecker(this.expressionCtx);
        undeclaredChecker.verify();
    }

    @Override
    public void execute() {
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(this, this.expressionCtx);

        System.out.println(this.statementToPrint);//TODO PRINT STATEMENT ON FRONT END
        View.printInConsole(this.statementToPrint);
        this.statementToPrint = ""; //reset statement to print afterwards
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visitErrorNode(ErrorNode node) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        if(ctx instanceof TripleJParser.LiteralContext) {
            TripleJParser.LiteralContext literalCtx = (TripleJParser.LiteralContext) ctx;

            if(literalCtx.StringLiteral() != null) {
                String quotedString = literalCtx.StringLiteral().getText();

                this.statementToPrint += StringUtilities.removeQuotes(quotedString);
            }
            else if(literalCtx.IntegerLiteral() != null) {
                int value = Integer.parseInt(literalCtx.IntegerLiteral().getText());
                this.statementToPrint += value;
            }

            else if(literalCtx.FloatingPointLiteral() != null) {
                float value = Float.parseFloat(literalCtx.FloatingPointLiteral().getText());
                this.statementToPrint += value;
            }

            else if(literalCtx.BooleanLiteral() != null) {
                this.statementToPrint += literalCtx.BooleanLiteral().getText();
            }

            else if(literalCtx.CharacterLiteral() != null) {
                String quotedString = literalCtx.CharacterLiteral().getText();
                this.statementToPrint +=  StringUtilities.removeQuotes(quotedString);
            }
        }

        else if(ctx instanceof TripleJParser.PrimaryContext) {
            TripleJParser.PrimaryContext primaryCtx = (TripleJParser.PrimaryContext) ctx;

            if(primaryCtx.expression() != null) {
                TripleJParser.ExpressionContext exprCtx = primaryCtx.expression();
                this.complexExpr = true;
//                Console.log(LogType.DEBUG, "Complex expression detected: " +exprCtx.getText());

                EvaluationCommand evaluationCommand = new EvaluationCommand(exprCtx);
                evaluationCommand.execute();

                this.statementToPrint += evaluationCommand.getResult().toEngineeringString();
            }

            else if(primaryCtx.Identifier() != null && this.complexExpr == false) {
                String identifier = primaryCtx.getText();

                TripleJParser value = TripleJValueSearch.searchVariable(identifier);
                if(value.getPrimitiveType() == TripleJValue.PrimitiveType.ARRAY) {
                    this.arrayAccess = true;
                    this.evaluateArrayPrint(value, primaryCtx);
                }
                else if(this.arrayAccess == false) {
                    this.statementToPrint += value.getValue();
                }


            }
        }
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {

    }

    public String getStatementToPrint() {
        return this.statementToPrint;
    }

    private void evaluateArrayPrint(TripleJValue corgiValue, TripleJParser.PrimaryContext primaryCtx) {

        //move up and determine expression contexts
        TripleJParser.ExpressionContext parentExprCtx = (TripleJParser.ExpressionContext) primaryCtx.getParent().getParent();
        TripleJParser.ExpressionContext arrayIndexExprCtx = parentExprCtx.expression(1);

        EvaluationCommand evaluationCommand = new EvaluationCommand(arrayIndexExprCtx);
        evaluationCommand.execute();

        TripleJArray tripleJArray = (TripleJArray) corgiValue.getValue();
        TripleJValue arrayCorgiValue = tripleJArray.getValueAt(evaluationCommand.getResult().intValue());

        this.statementToPrint += arrayCorgiValue.getValue().toString();
    }



}
