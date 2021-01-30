package SymbolTable;

import Items.TripleJArray;
import Items.TripleJValue;

import java.util.ArrayList;
import java.util.HashMap;

public class Scope {
    private Scope parentScope;
    private HashMap<String, TripleJValue> localVariables = null;
    private HashMap<String, TripleJArray> localArrays = null;
    private ArrayList<Scope> scopes = null;

    public Scope(){
        this.parentScope = null;
        this.localVariables = new HashMap<String, TripleJValue>();
        this.localArrays = new HashMap<String, TripleJArray>();
        this.scopes = new ArrayList<Scope>();
    }

    public Scope(Scope scope){
        this.parentScope = scope;
        this.localVariables = new HashMap<String, TripleJValue>();
        this.localArrays = new HashMap<String, TripleJArray>();
        this.scopes = new ArrayList<Scope>();
    }

    public Scope getParentScope(){
        return this.parentScope;
    }

    public void setParentScope(Scope scope){
        this.parentScope = scope;
    }

    public boolean isParent(){
        return (this.parentScope == null);
    }

    public void addChild(Scope scope){
        this.scopes.add(scope);
    }

    public Scope getChild(int index){
        if(this.scopes != null)
            return this.scopes.get(index);
        else
            return null;
    }

    public int getCount(){
        if(this.scopes != null)
            return this.scopes.size();
        else
            return 0;
    }

    public void addValue(String identifier, TripleJValue value){
        this.localVariables.put(identifier, value);
    }

    public void addArray(String identifier, String type, int size){
        TripleJArray array = new TripleJArray(type);
        array.initialize(size);
        this.localArrays.put(identifier, array);
    }

    public boolean containsVar(String identifier){
        if((this.localArrays != null && this.localArrays.containsKey(identifier))||(this.localVariables != null && this.localVariables.containsKey(identifier)))
            return true;
        else
            return false;
    }

    public TripleJValue searchVar(String identifier){
        if(this.containsVar(identifier))
            return this.localVariables.get(identifier);
        else
            return null;
    }

    public TripleJArray searchArray(String identifier) {
        if (this.containsVar(identifier))
            return this.localArrays.get(identifier);
        else
            return null;
    }

    public void setDeclaredVars(String identifier, String value){
        if(containsVar(identifier))
            this.localVariables.get(identifier).setValue(value);
    }

    public void addEmptyVarFromKeywords(String type, String identifier){
        TripleJValue.PrimitiveType primitiveType = TripleJValue.convertType(type);
        TripleJValue tripleJValue = TripleJValue.createEmptyVariableFromKeywords(type);
        tripleJValue.setType(primitiveType);
        this.localVariables.put(identifier,tripleJValue);
    }

    public void addInitializedVarFromKeywords(String type, String identifier, String value){
        TripleJValue.PrimitiveType primitiveType = TripleJValue.convertType(type);
        this.addEmptyVarFromKeywords(type, identifier);
        TripleJValue tripleJValue = this.localVariables.get(identifier);
        tripleJValue.setValue(value);
        tripleJValue.setType(primitiveType);
    }


}