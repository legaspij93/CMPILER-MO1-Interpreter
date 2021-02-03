package interpreter.commands;

import antlr.TripleJParser;

import java.util.ArrayList;
import java.util.List;

public class IfCommand implements INTCommand {
    private List<INTCommand> positiveCommands;
    private List<INTCommand> negativeCommands;

    private TripleJParser.ConditionalExpressionContext expressionContext;

    private ArrayList<String> localVar = new ArrayList<>();
    private boolean returned;

    public IfCommand(TripleJParser.ConditionalExpressionContext expressionContext){
        this.positiveCommands = new ArrayList<INTCommand>();
        this.negativeCommands = new ArrayList<INTCommand>();
        this.expressionContext = expressionContext;
    }

    @Override
    public void execute(){
        this.identifyVariables();

        try{
            if(EvaluateCondition.evaluateCond(this.expressionContext)){
                for(INTCommand command : this.positiveCommands){
                    command.execute();
                }
            } else{
                for(INTCommand command : this.negativeCommands){
                    command.execute();
                }
            }
        } catch (Exception e){
            System.out.println("ERROR "+e.getMessage());
        }
    }

    public void clearCommands(){
        this.positiveCommands.clear();
        this.negativeCommands.clear();
    }

    public void addPositiveCommand(INTCommand command){

        this.positiveCommands.add(command);

    }

    public void addNegativeCommand(INTCommand command){

        this.negativeCommands.add(command);
    }

    private void identifyVariables(){
        //Value Stuff to be added
    }

    public boolean isReturned(){return returned;}

    public boolean check(){
        if (EvaluateCondition.evaluateCond(this.expressionContext))
            return true;
        else
            return false;
    }
}