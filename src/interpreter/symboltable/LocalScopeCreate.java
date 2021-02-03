package interpreter.symboltable;

import interpreter.representations.TripleJValue;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LocalScopeCreate {
    private final static String TAG = "ScopeCreator";

    private static LocalScopeCreate sharedInstance = null;

    public static LocalScopeCreate getInstance() {
        return sharedInstance;
    }

    private LocalScope activeLocalScope = null;

    private LocalScopeCreate() {

    }

    public static void initialize() {
        sharedInstance = new LocalScopeCreate();
    }

    public static void reset() {
        sharedInstance.activeLocalScope = null;
    }

    /*
     * Opens a new local scope instance. If the active local scope instance is null,
     * it creates a new one and sets it as a parent. Otherwise, the active local scope is set as
     * a parent of the new instance, then the new instance becomes the active local scope.
     */
    public LocalScope openLocalScope() {
        if(this.activeLocalScope == null) {
            this.activeLocalScope = new LocalScope();
        }
        else {
            LocalScope childLocalScope = new LocalScope();
            childLocalScope.setParent(this.activeLocalScope);//point this current local scope as parent
            this.activeLocalScope.addChild(childLocalScope); //add the new scope as child for this current local scope
            this.activeLocalScope = childLocalScope; //change pointer to the child scope
        }

        return this.activeLocalScope;
    }

    public LocalScope getActiveLocalScope() {
        return this.activeLocalScope;
    }

    /*
     * Closes the active local scope which changes the pointer to the parent of the active local scope.
     */
    public void closeLocalScope() {
        if(this.activeLocalScope.getParent() != null && this.activeLocalScope.getParent() instanceof LocalScope) {
            this.activeLocalScope = (LocalScope) this.activeLocalScope.getParent();
        }
        else if(this.activeLocalScope.getParent() == null) {
            System.out.println(TAG + ": " + "Cannot change parent. Current active local scope no longer has a parent.");
        }
        else {
            System.out.println(TAG + ": " + "Cannot change parent. Current active local scope's parent is now a class scope.");
        }
    }

    /*
     * Searches for a local variable using an iterative depth-first search.
     */
    public static TripleJValue searchVariableInLocalIterative(String identifier, LocalScope localScope) {

        if(localScope == null) {
            System.out.println(TAG + ": " + identifier + " not found in any local scope!");
            return null;
        }

        Stack<LocalScope> stack = new Stack<LocalScope>();

        stack.push(localScope);

        List<LocalScope> discoveredScopes = new ArrayList<LocalScope>();
        LocalScope scope;

        while(!stack.isEmpty()) {
            scope = stack.pop();

            if(scope.containsVariable(identifier)) {
                return scope.searchVariableIncludingLocal(identifier);
            }

            if(!discoveredScopes.contains(scope)) {
                discoveredScopes.add(scope);

                for(int i = 0; i < scope.getChildCount(); i++) {
                    LocalScope childScope = scope.getChildAt(i);
                    stack.push(childScope);
                }
            }
        }

        System.out.println(TAG + ": " + identifier + " not found in any local scope!");
        return null;
    }
}
