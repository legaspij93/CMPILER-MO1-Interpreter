package interpreter.execution;

import interpreter.representations.TripleJFunction;

import java.util.Stack;

public class FunctionTracker {

    private static FunctionTracker instance = null;

    private Stack<TripleJFunction> callStack;

    public static FunctionTracker getInstance(){
        if(instance == null)
            instance = new FunctionTracker();
        return instance;
    }

    private FunctionTracker(){
        this.callStack = new Stack<>();
    }

    public void reportEnterFunction(TripleJFunction function){
        this.callStack.push(function);
    }

    public void reportExit(){
        this.callStack.pop();
    }

    public TripleJFunction getLatest(){
        return this.callStack.peek();
    }

    public boolean isInside(){
        return (this.callStack.size()!= 0);
    }
}
