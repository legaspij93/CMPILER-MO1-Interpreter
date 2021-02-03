package interpreter.execution.adders;

import java.util.ArrayList;

public class MainExecutionAdder implements IExecutionAdder{
    private ArrayList<commands.ICommand> mainExecList;

    public MainExecutionAdder(ArrayList<commands.ICommand> mainExecList){
        this.mainExecList = mainExecList;
    }

    @Override
    public void addCommand(commands.ICommand command){
        this.mainExecList.add(command);
    }
}
