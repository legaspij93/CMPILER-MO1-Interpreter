package commands;

public interface INTConditionalCommand extends INTCommand {
    public abstract INTControlledCommand.ControlType getControlType();
    public abstract void positiveCommand(INTCommand command);
    public abstract void negativeCommand(INTCommand command);
}