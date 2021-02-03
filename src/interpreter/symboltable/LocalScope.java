package interpreter.symboltable;

import interpreter.representations.TripleJValue;

import java.util.ArrayList;
import java.util.HashMap;

public class LocalScope implements INTScope {
    private final static String TAG = "LocalScope";

    private INTScope parentScope;
    private ArrayList<LocalScope> childScopeList = null;

    private HashMap<String, TripleJValue> localVariables = null;

    public LocalScope() {
        this.parentScope = null;
    }

    public LocalScope(INTScope parentScope) {
        this.parentScope = parentScope;
    }

    /*
     * Initialize the moment a variable is about to be placed.
     */
    public void initializeLocalVariableMap() {
        if(this.localVariables == null) {
            this.localVariables = new HashMap<String, TripleJValue>();
        }
    }

    /*
     * Initialize the child list the moment a child scope is about to be placed
     */
    public void initializeChildList() {
        if(this.childScopeList == null) {
            this.childScopeList = new ArrayList<LocalScope>();
        }
    }

    public void setParent(INTScope parentScope) {
        this.parentScope = parentScope;
    }

    public void addChild(LocalScope localScope) {
        this.initializeChildList();

        this.childScopeList.add(localScope);
    }

    public boolean isParent() {
        return (this.parentScope == null);
    }

    public INTScope getParent() {
        return this.parentScope;
    }

    public int getChildCount() {
        if(this.childScopeList != null)
            return this.childScopeList.size();
        else
            return 0;
    }

    public LocalScope getChildAt(int index) {
        if(this.childScopeList != null)
            return this.childScopeList.get(index);
        else
            return null;
    }

    @Override
    public TripleJValue searchVariableIncludingLocal(String identifier) {
        if(this.containsVariable(identifier)) {
            return this.localVariables.get(identifier);
        }
        else {
            System.out.println(TAG + ": " + identifier + " not found!");
            return null;
        }
    }

    public boolean containsVariable(String identifier) {
        if(this.localVariables!= null && this.localVariables.containsKey(identifier)) {
            return true;
        }
        else {
            return false;
        }
    }

    /*
     * Adds an empty variable based from keywords
     */
    public void addEmptyVariableFromKeywords(String primitiveTypeString, String identifierString) {
        this.initializeLocalVariableMap();

        TripleJValue tripleJValue = TripleJValue.createEmptyVariableFromKeywords(primitiveTypeString);
        this.localVariables.put(identifierString, tripleJValue);
    }

    /*
     * Adds an initialized variable based from keywords
     */
    public void addInitializedVariableFromKeywords(String primitiveTypeString, String identifierString, String valueString) {
        this.initializeLocalVariableMap();

        this.addEmptyVariableFromKeywords(primitiveTypeString, identifierString);
        TripleJValue tripleJValue = this.localVariables.get(identifierString);
        tripleJValue.setVal(valueString);
    }

    public void addFinalEmptyVariableFromKeywords(String primitiveTypeString, String identifierString) {
        this.initializeLocalVariableMap();

        TripleJValue tripleJValue = TripleJValue.createEmptyVariableFromKeywords(primitiveTypeString);
        tripleJValue.markFlag();
        this.localVariables.put(identifierString, tripleJValue);
    }

    public void addFinalInitVariableFromKeyWords(String primitiveTypeString, String identifierString, String valueString) {
        this.initializeLocalVariableMap();

        this.addEmptyVariableFromKeywords(primitiveTypeString, identifierString);
        TripleJValue tripleJValue = this.localVariables.get(identifierString);
        tripleJValue.setVal(valueString);
        tripleJValue.markFlag();
    }

    public void addMobiValue(String identifier, TripleJValue tripleJValue) {
        this.initializeLocalVariableMap();
        this.localVariables.put(identifier, tripleJValue);
    }

    /*
     * Returns the depth of this local scope.
     */
    public int getDepth() {
        int depthCount = -1;

        LocalScope scope = (LocalScope) this;

        while(scope != null) {
            depthCount++;

            INTScope abstractScope = scope.getParent();

            if(abstractScope instanceof ClassScope)
                break;

            scope = (LocalScope) abstractScope;
        }

        return depthCount;
    }
}
