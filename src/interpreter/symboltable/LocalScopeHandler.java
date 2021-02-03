package interpreter.symboltable;

import interpreter.representations.TripleJValue;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LocalScopeHandler {
    private static LocalScopeHandler instance = null;

    public static LocalScopeHandler getInstance(){
        if(instance == null)
            instance = new LocalScopeHandler();
        return instance;
    }

    private LocalScope activeScope = null;

    private LocalScopeHandler(){

    }

    public static void initialize(){
        instance = new LocalScopeHandler();
    }

    public static void reset(){
        if(instance != null && instance.activeScope != null)
            instance.activeScope = null;
    }

    public LocalScope openLocalScope(){
        if(this.activeScope == null)
            this.activeScope = new LocalScope();
        else{
            LocalScope childScope = new LocalScope();
            childScope.setParent(this.activeScope);
            this.activeScope.addChild(childScope);
            this.activeScope = childScope;
        }

        return this.activeScope;
    }

    public LocalScope getActiveScope(){
        return this.activeScope;
    }

    public void closeLocalScope(){
        if(this.activeScope.getParent() != null && this.activeScope.getParent() instanceof LocalScope)
            this.activeScope = (LocalScope) this.activeScope.getParent();
        else if(this.activeScope.getParent() == null)
            System.err.println("Cannot change parent. Current active local scope no longer has a parent.");
        else
            System.err.println("Cannot change parent. Current active local scope's parent is now a class scope");
    }

    public static TripleJValue searchVariableInLocalIterative(String identifier, LocalScope scope) {
        if(scope == null) {
            System.err.println(identifier + " not found in any local scope!");
            return null;
        }

        Stack<LocalScope> stack = new Stack<LocalScope>();

        stack.push(scope);

        List<LocalScope> discoveredScopes = new ArrayList<LocalScope>();
        LocalScope localScope;

        while(!stack.isEmpty()) {
            localScope = stack.pop();

            if(localScope.containsVariable(identifier)) {
                return localScope.searchVariableIncludingLocal(identifier);
            }

            if(!discoveredScopes.contains(localScope)) {
                discoveredScopes.add(localScope);

                for(int i = 0; i < localScope.getChildCount(); i++) {
                    LocalScope childScope = localScope.getChildAt(i);
                    stack.push(childScope);
                }
            }
        }
        System.err.println(identifier + " not found in any local scope!");
        return null;
    }

}
