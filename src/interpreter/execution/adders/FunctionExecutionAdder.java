package interpreter.execution.adders;

import interpreter.representations.TripleJFunction;

public class FunctionExecutionAdder implements IExecutionAdder{
    private TripleJFunction assignedFunction;

    public FunctionExecutionAdder(TripleJFunction function){
        this.assignedFunction = function;
    }

    @Override
    public void addCommand(commands.ICommand command){
        this.assignedFunction.addCommand(command);
    }

    public TripleJFunction getAssignedFunction(){
        return this.assignedFunction;
    }
}
