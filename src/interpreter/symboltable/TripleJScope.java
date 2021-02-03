package interpreter.symboltable;

import grammar.TripleJParser;
import interpreter.representations.TripleJFunction;
import interpreter.representations.TripleJValue;

import java.util.HashMap;

public class TripleJScope implements IScope{
    private HashMap<String, TripleJValue> vars;
    private HashMap<String, TripleJFunction> funcs;

    private LocalScope parentLocalScope;

    public TripleJScope(){
        this.vars = new HashMap<>();
        this.funcs = new HashMap<>();
    }

    public void setParentLocalScope(LocalScope scope){
        this.parentLocalScope = scope;
    }

    @Override
    public boolean isParent(){
        return true;
    }

    public void addEmptyVariable(String typeString, String identifier){
        TripleJValue value = TripleJValue.createEmptyVariableFromKeywords(typeString);

        this.vars.put(identifier, value);
    }

    public void addInitializedVariable(String typeString, String identifier, String value){
        this.addEmptyVariable(typeString, identifier);

        TripleJValue val = this.vars.get(identifier);

        val.setVal(value);
    }

    public TripleJValue getVariable(String identifier){
        if(this.containsVariable(identifier))
            return this.vars.get(identifier);
        else
            return null;
    }

    public void addFunction(String identifier, TripleJFunction function){
        this.funcs.put(identifier, function);
    }

    public void addTripleJValue(String identifier, TripleJValue value){
        this.vars.put(identifier, value);
    }

    public TripleJFunction getFunction(String identifier){
        if(this.containsFunction(identifier))
            return this.funcs.get(identifier);
        else
            return null;
    }

    public TripleJFunction searchFunction(String identifier) {
        if(this.containsFunction(identifier)) {
            return this.funcs.get(identifier);
        }
        else {
            return null;
        }
    }

    public boolean containsFunction(String identifier) {
        return this.funcs.containsKey(identifier);
    }

    @Override
    public TripleJValue searchVariableIncludingLocal(String identifier) {
        TripleJValue value;
        if(this.containsVariable(identifier)) {
            value = this.getVariable(identifier);
        }
        else {
            value = LocalScopeHandler.searchVariableInLocalIterative(identifier, this.parentLocalScope);
        }

        return value;
    }

    public TripleJValue searchVariable(String identifier) {
        TripleJValue value = null;
        if(this.containsVariable(identifier)) {
            value = this.getVariable(identifier);
        }

        return value;
    }

    public boolean containsVariable(String identifier) {
        return this.vars.containsKey(identifier);
    }

    /*
     * Resets all stored variables. This is called after the execution manager finishes
     */
    public void reset() {
        this.vars = new HashMap<>();
        this.funcs = new HashMap<>();
    }

    public void printAllFunctions(){
        for(TripleJFunction function: this.funcs.values())
            System.out.println(function.getFuncName());
    }
}
