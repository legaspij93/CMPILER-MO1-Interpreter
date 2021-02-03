package interpreter.commands;

public interface IControlledCommand extends INTCommand {
    public enum ControlTypeEnum{
        CONDITIONAL_IF,
        DO_WHILE,
        WHILE,
        FOR,
        FUNCTION_TYPE
    }

    public abstract ControlTypeEnum getControlType();
    public abstract void addCommand(INTCommand command);
}