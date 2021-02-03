package items;

import commands.*;
import execution.ExecutionManager;

import java.util.Stack;

public class StatementControl {
    private static StatementControl sharedInstance = null;

    public static StatementControl getInstance(){
        return sharedInstance;
    }

    private Stack<INTCommand> callStack;
    private INTCommand activeCommand = null;

    private boolean isPositive = true;

    private StatementControl(){
        this.callStack = new Stack<INTCommand>();
    }

    public static void initialize(){
        sharedInstance = new StatementControl();
    }

    public static void reset(){
        sharedInstance.callStack.clear();
        sharedInstance.activeCommand = null;
    }

    public void callConditionalCommand(INTConditionalCommand command){
        if(callStack.isEmpty()){
            this.callStack.push(command);
            this.activeCommand = command;
        }
        else
            this.addNewCommand(command);
        this.isPositive = true;
    }

    public void addNewCommand(INTCommand command){
        if(this.inConditionalCommand()){
            INTConditionalCommand condCommand = (INTConditionalCommand) this.activeCommand;

            if(this.isPositiveRule())
                condCommand.positiveCommand(command);
            else
                condCommand.negativeCommand(command);
            this.callStack.push(command);
            this.activeCommand = command;
        }
    }

    public boolean isPositiveRule(){
        return this.isPositive;
    }

    public void exitPositiveRule(){
        this.isPositive = false;
    }

    public boolean inConditionalCommand(){
        return (this.activeCommand != null && activeCommand instanceof INTConditionalCommand);
    }

    public void openControlledCommand(INTControlledCommand command){
        this.callStack.push(command);
        this.activeCommand = command;

    }

    public void compileControlledCommand(){
        if(this.callStack.size() == 1){
            INTCommand rootCmd = this.callStack.pop();
            ExecutionManager.getInstance().addCommand(rootCmd);

            this.activeCommand = null;
        }
        else if(this.callStack.size() > 1){
            INTCommand childCommand = this.callStack.pop();
            INTCommand parentCommand = this.callStack.peek();
            this.activeCommand = parentCommand;

            if(childCommand instanceof ForCommand || childCommand instanceof WhileCommand){
                if(parentCommand instanceof ForCommand || parentCommand instanceof WhileCommand){
                    INTControlledCommand controlledCommand = (INTControlledCommand) parentCommand;
                    controlledCommand.addCommand(childCommand);
                } else if (parentCommand instanceof IfCommand){
                    INTConditionalCommand conditionalCommand = (INTConditionalCommand) parentCommand;
                    if(isPositiveRule())
                        conditionalCommand.positiveCommand(childCommand);
                    else
                        conditionalCommand.negativeCommand(childCommand);
                }
            }
        }
        else {

        }
    }

    public boolean isInConditionalCommand() {
        return (this.activeCommand != null && activeCommand instanceof INTConditionalCommand);
    }

    public boolean isInControlledCommand() {
        return (this.activeCommand!= null && this.activeCommand instanceof INTControlledCommand);
    }

    public INTCommand getActiveControlledCommand() {
        return this.activeCommand;
    }

}
