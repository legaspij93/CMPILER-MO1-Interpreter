package adders;

import commands.INTCommand;

import java.util.ArrayList;

public class MainExecutionAdder implements INTExecutionAdder{
    private ArrayList<INTCommand> mainExecList;

    public MainExecutionAdder(ArrayList<INTCommand> mainExecList){
        this.mainExecList = mainExecList;
    }

    @Override
    public void addCommand(INTCommand command){
        this.mainExecList.add(command);
    }
}
