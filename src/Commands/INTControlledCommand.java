package Commands;

public interface INTControlledCommand extends INTCommand {
    public enum ControlType{
        CONDITIONAL_IF,
        DO_WHILE,
        WHILE,
        FOR,
        FUNCTION_TYPE
    }

    public abstract ControlType getControlType();
    public abstract void addCommand(INTCommand command);
}