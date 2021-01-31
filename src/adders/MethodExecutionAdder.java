package adders;

import commands.INTCommand;
import items.TripleJMethod;

public class MethodExecutionAdder implements INTExecutionAdder{

    private TripleJMethod assignedFunction;

    public MethodExecutionAdder(TripleJMethod function){
        this.assignedFunction = function;
    }

    @Override
    public void addCommand(INTCommand command){
//        this.assignedFunction.addCommand(command);
    }

    public TripleJMethod getAssignedFunction(){
        return this.assignedFunction;
    }

}
