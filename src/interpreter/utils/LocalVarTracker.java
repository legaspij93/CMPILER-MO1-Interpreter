package interpreter.utils;

import interpreter.commands.AssignmentCommand;
import interpreter.commands.INTCommand;
import interpreter.commands.IncDecCommand;
import interpreter.commands.MappingCommand;

import java.util.ArrayList;
import java.util.Stack;

public class LocalVarTracker {
    private static LocalVarTracker sharedInstance = null;

    private Stack<ArrayList<String>> sessions;

    public static LocalVarTracker getInstance() {
        return sharedInstance;
    }

    public static void initialize() {
        sharedInstance = new LocalVarTracker();
        System.out.println("Initialize Local Variable Tracker");
    }

    public static void reset() {
        sharedInstance = new LocalVarTracker();
    }

    public LocalVarTracker () {
        sessions = new Stack<ArrayList<String>>();
    }

    public void populateLocalVars(INTCommand command) {

        if (!sessions.isEmpty()) {

            if (command instanceof MappingCommand) {
                sessions.peek().add(((MappingCommand) command).getIdentifierString());
            } else if (command instanceof AssignmentCommand) {
                if (!((AssignmentCommand) command).isLeftHandArrayAccessor())
                    sessions.peek().add(((AssignmentCommand) command).getLeftHandExprCtx().getText());
            } else if (command instanceof IncDecCommand) {
                sessions.peek().add(((IncDecCommand) command).getIdentifierString());
            }
        }

    }

    public static void resetLocalVars(ArrayList<String> localVars) {
        localVars.clear();
    }

    public void startNewSession() {
        sessions.push(new ArrayList<String>());
    }

    public ArrayList<String> getCurrentSession() {
        return sessions.peek();
    }

    public ArrayList<String> endCurrentSession() {
        return sessions.pop();
    }
}
