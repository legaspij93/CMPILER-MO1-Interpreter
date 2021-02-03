package execution;

import commands.INTCommand;

import javax.management.Notification;
import javax.management.NotificationListener;
import java.util.ArrayList;

public class ExecutionManager implements NotificationListener {
    private static ExecutionManager sharedInstance = null;
    private ArrayList<INTCommand> commands = new ArrayList<>();
    private boolean found = false;
    private String entryClassName = null;

    public static ExecutionManager getInstance(){
        return sharedInstance;
    }

    private INTExecutionAdder activeExecutionAdder;
    private ExecutionMonitor executionMonitor;

    @Override
    public void handleNotification(Notification notification, Object handback){

    }

    public ExecutionMonitor getExecutionMonitor() {
        return this.executionMonitor;
    }

    public void addCommand(INTCommand command){
        this.activeExecutionAdder.addCommand(command);
    }
}
