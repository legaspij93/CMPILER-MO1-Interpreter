package interpreter.execution;

import commands.ICommand;
import interpreter.utils.Notifications;

import java.util.ArrayList;

public class ExecutionThread extends Thread{
    private final static String TAG = "ExecutionThread";

    private ArrayList<commands.ICommand> execList = new ArrayList<ICommand>();
    private ExecutionMonitor execMonitor;

    public ExecutionThread(ArrayList<ICommand> execList, ExecutionMonitor execMonitor){
        this.execList = execList;
        this.execMonitor = execMonitor;
    }

    @Override
    public void run(){
        try{
            for(ICommand command: this.execList){
                this.execMonitor.tryExec();
                command.execute();
            }
        }
        catch (InterruptedException e){
            System.err.println("Monitor block interrupted! " + e.getMessage());
        }

        NotificationCenter.getInstance().postNotification(Notifications.ON_EXECUTION_FINISHED);
    }
}
