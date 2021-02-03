package interpreter.commands;

public interface IConditionalCommand extends INTCommand {
    public abstract INTControlledCommand.ControlType getControlType();
    public abstract void positiveCommand(INTCommand command);
    public abstract void negativeCommand(INTCommand command);
}