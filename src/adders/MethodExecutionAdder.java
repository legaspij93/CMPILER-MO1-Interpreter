package adders;

import commands.INTCommand;
import items.TripleJFunction;

public class MethodExecutionAdder implements INTExecutionAdder{

    private TripleJFunction assignedFunction;

    public MethodExecutionAdder(TripleJFunction function){
        this.assignedFunction = function;
    }

    @Override
    public void addCommand(INTCommand command){
//        this.assignedFunction.addCommand(command);
    }

    public TripleJFunction getAssignedFunction(){
        return this.assignedFunction;
    }

}
