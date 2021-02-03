package interpreter.commands;

public interface IControlledCommand extends ICommand {
    public enum ControlTypeEnum{
        CONDITIONAL_IF,
        DO_WHILE,
        WHILE,
        FOR,
        FUNCTION_TYPE
    }

    public abstract ControlTypeEnum getControlType();
    public abstract void addCommand(ICommand command);
}