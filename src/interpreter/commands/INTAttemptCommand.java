package interpreter.commands;

public interface INTAttemptCommand extends INTCommand {

    public enum CatchTypeEnum {
        ARRAY_OUT_OF_BOUNDS,
        NEGATIVE_ARRAY_SIZE,
        ARITHMETIC_EXCEPTION
    }

    public abstract INTControlledCommand.ControlType getControlType();
    public abstract void addTryCommand(INTCommand command);
    public abstract void addCatchCommand(CatchTypeEnum catchTypeEnum, INTCommand command);
    public abstract boolean hasCatchFor(CatchTypeEnum catchTypeEnum);

}
