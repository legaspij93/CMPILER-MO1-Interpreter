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

    @Override
    public void handleNotification(Notification notification, Object handback){

    }
}
