package SymbolTable;

import Items.TripleJValue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class SymbolTableManager {
    private HashMap<String, TripleJValue> symbolTable;
    private Scope scope = null;

    private static SymbolTableManager sharedInstance = null;

    public static SymbolTableManager getInstance(){
        return sharedInstance;
    }

    public static void initialize(){
        sharedInstance = new SymbolTableManager();
    }

    public static void destroy(){
        sharedInstance = null;
    }

    public Scope openScope(){
        if(SymbolTableManager.getInstance().scope == null){
            SymbolTableManager.getInstance().scope = new Scope();
        }
        else{
            Scope childScope = new Scope();
            childScope.setParentScope(SymbolTableManager.getInstance().scope);
            SymbolTableManager.getInstance().scope.addChild(childScope);
            SymbolTableManager.getInstance().scope = childScope;
        }

        return this.scope;
    }

    public void closeScope(){
        if(this.scope.getParentScope() instanceof Scope && this.scope.getParentScope() != null)
            this.scope = this.scope.getParentScope();
        else if(this.scope.getParentScope() == null)
            System.out.println(": " + "Cannot change parent. Active scope has no parent.");
        else
            System.out.println(": " + "Cannot change parent. Active scope is now a class scope.");
    }

    public static TripleJValue searchVariableInLocalIterative(String identifier, Scope scope) {

        if(scope == null)
            return null;

        Stack<Scope> stack = new Stack<Scope>();

        stack.push(scope);

        List<Scope> discovered = new ArrayList<Scope>();
        Scope newScope;

        while(!stack.isEmpty()) {
            newScope = stack.pop();

            if(newScope.containsVar(identifier)) {
                return scope.searchVar(identifier);
            }

            if(!discovered.contains(newScope)) {
                discovered.add(newScope);

                for(int i = 0; i < newScope.getCount(); i++) {
                    Scope child = newScope.getChild(i);
                    stack.push(child);
                }
            }
        }

        System.out.println(": " + identifier + " not found in any local scope!");
        return null;
    }

    public static void reset(){
        sharedInstance.scope = null;
    }

    public Scope getScope(){
        return this.scope;
    }
}