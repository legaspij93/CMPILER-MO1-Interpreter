package interpreter.statements;

import interpreter.commands.ICommand;
import interpreter.commands.IConditionalCommand;
import interpreter.commands.IControlledCommand;
import interpreter.execution.ExecutionManager;

import java.util.Stack;

public class StatemenetControlOverseer {
    private static StatemenetControlOverseer sharedInstance = null;

    public static StatemenetControlOverseer getInstance() {
        return sharedInstance;
    }

    private Stack<ICommand> procedureCallStack;
    private ICommand activeControlledCommand = null;

    private boolean isInPositive = true;

    private StatemenetControlOverseer(){
        this.procedureCallStack = new Stack<ICommand>();

        System.out.println("Stack initialized!");
    }

    public static void initialize(){
        sharedInstance = new StatemenetControlOverseer();
    }

    public static void reset(){
        sharedInstance.procedureCallStack.clear();
        sharedInstance.activeControlledCommand = null;
    }

    public void openConditionalCommand(IConditionalCommand command){
        if(this.procedureCallStack.isEmpty()){
            this.procedureCallStack.push(command);
            this.activeControlledCommand = command;
        }
        else{
            this.processAdditionOfCommand(command);
        }

        this.isInPositive = true;
    }

    public void openControlledCommand(IControlledCommand command){
        this.procedureCallStack.push(command);
        this.activeControlledCommand = command;
    }

    public boolean isInPositive(){
        return this.isInPositive;
    }

    public void reportExitPositiveRule(){
        this.isInPositive = false;
    }

    private void processAdditionOfCommand(ICommand command){
        if(this.isInConditionalCommand()){
            IConditionalCommand conditionalCommand = (IConditionalCommand) this.activeControlledCommand;

            if(this.isInPositive())
                conditionalCommand.addPositiveCommand(command);
            else
                conditionalCommand.addNegativeCommand(command);

            this.procedureCallStack.push(command);
            this.activeControlledCommand = command;
        }
        else{
            IControlledCommand controlledCommand = (IControlledCommand) this.activeControlledCommand;
            controlledCommand.addCommand(command);

            this.procedureCallStack.push(command);
            this.activeControlledCommand = controlledCommand;
        }
    }

    public void compileControlledCommand(){
        if(this.procedureCallStack.size() == 1){
            ICommand rootCommand = this.procedureCallStack.pop();
            ExecutionManager.getInstance().addCommand(rootCommand);

            this.activeControlledCommand = null;
        }
        else if(this.procedureCallStack.size() > 1){
            ICommand childCommand = this.procedureCallStack.pop();
            ICommand parentCommand = this.procedureCallStack.pop();
            this.activeControlledCommand = parentCommand;

            if(parentCommand instanceof IControlledCommand){
                IControlledCommand controlledCommand = (IControlledCommand) parentCommand;
                controlledCommand.addCommand(childCommand);
            }
        }
        else
            System.err.println("Procedure call stack is now empty.");
    }

    public boolean isInConditionalCommand(){
        return (this.activeControlledCommand != null && activeControlledCommand instanceof IConditionalCommand);
    }

    public boolean isInControlledCommand(){
        return (this.activeControlledCommand != null && this.activeControlledCommand instanceof IControlledCommand);
    }

    public ICommand getActiveControlledCommand() {
        return this.activeControlledCommand;
    }
}
