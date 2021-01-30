package execution;

import commands.INTCommand;

import java.util.ArrayList;

public class ExecutionThread extends Thread{
    private ArrayList<INTCommand> commandList = new ArrayList<>();
    private ExecutionMonitor executionMonitor;

    public ExecutionThread(ArrayList<INTCommand> commands, ExecutionMonitor executionMonitor){
        this.commandList = commands;
        this.executionMonitor = executionMonitor;
    }

    @Override
    public void run(){
        try {
            for(INTCommand command : this.commandList){
                this.executionMonitor.tryExecution();
                command.execute();
            }
        }catch (InterruptedException e){
            System.out.println("Interrupted!");
        }
    }
}
