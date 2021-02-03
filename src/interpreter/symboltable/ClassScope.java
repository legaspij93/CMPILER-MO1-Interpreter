package interpreter.symboltable;

import interpreter.representations.RecognizedKeywords;
import interpreter.representations.TripleJFunction;
import interpreter.representations.TripleJValue;

import java.util.HashMap;

public class ClassScope implements INTScope {
    private final static String TAG = "ClassScope";

    private String className;

    private HashMap<String, TripleJValue> publicVariables;
    private HashMap<String, TripleJValue> privateVariables;

    private HashMap<String, TripleJFunction> publicMethods;
    private HashMap<String, TripleJFunction> privateMethods;

    private LocalScope parentLocalScope; //represents the parent local scope which is the local scope covered by the main() function. Other classes may not contain this.

    public ClassScope(String className) {
        this.className = className;

        this.publicVariables = new HashMap<String, TripleJValue>();
        this.privateVariables = new HashMap<String, TripleJValue>();

        this.publicMethods = new HashMap<String, TripleJFunction>();
        this.privateMethods = new HashMap<String, TripleJFunction>();
    }

    public String getClassName() {
        return this.className;
    }


    /*
     * Sets the parent local scope which is instantiated if this class contains a main function.
     */
    public void setParentLocalScope(LocalScope localScope) {
        this.parentLocalScope = localScope;
    }

    @Override
    /*
     * A class scope is automatically the parent of local scopes.
     * (non-Javadoc)
     * @see com.neildg.mobiprog.semantics.symboltable.scopes.IScope#isParent()
     */
    public boolean isParent(){
        return true;
    }

    /*
     * Attempts to add an empty variable based from keywords
     */
    public void addEmptyVariableFromKeywords(String classModifierString, String primitiveTypeString, String identifierString) {
        boolean isPublic = true;

        if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.CLASS_MODIFIER_PRIVATE, classModifierString)) {
            isPublic = false;
        }

        //create empty mobi value
        TripleJValue mobiValue = TripleJValue.createEmptyVariableFromKeywords(primitiveTypeString);

        if(isPublic) {
            this.publicVariables.put(identifierString, mobiValue);
            System.out.println("Created public variable " +identifierString+ " type: " +mobiValue.getPrimitiveType());
        }
        else {
            this.privateVariables.put(identifierString, mobiValue);
            System.out.println("Created private variable " +identifierString+ " type: " +mobiValue.getPrimitiveType());
        }
    }

    /*
     * Attempts to add an initialized variable mobi value
     */
    public void addInitializedVariableFromKeywords(String classModifierString, String primitiveTypeString, String identifierString, String valueString) {
        boolean isPublic = true;

        if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.CLASS_MODIFIER_PRIVATE, classModifierString)) {
            isPublic = false;
        }

        this.addEmptyVariableFromKeywords(classModifierString, primitiveTypeString, identifierString);

        if(isPublic) {
            TripleJValue baracoValue = this.publicVariables.get(identifierString);
            baracoValue.setVal(valueString);
            System.out.println("Updated public variable " +identifierString+ " of type " +baracoValue.getPrimitiveType()+ " with value " +valueString);
        }
        else {
            TripleJValue baracoValue = this.privateVariables.get(identifierString);
            baracoValue.setVal(valueString);
            System.out.println("Updated private variable " +identifierString+ " of type " +baracoValue.getPrimitiveType()+ " with value " +valueString);
        }
    }

    public TripleJValue getPublicVariable(String identifier) {
        if(this.containsPublicVariable(identifier)) {
            return this.publicVariables.get(identifier);
        }
        else {
            System.out.println(TAG + ": " + "Public " +identifier + " is not found.");
            return null;
        }
    }

    public TripleJValue getPrivateVariable(String identifier) {
        if(this.containsPrivateVariable(identifier)) {
            return this.privateVariables.get(identifier);
        }
        else {
            System.out.println(TAG + ": " + "Private " +identifier + " is not found.");
            return null;
        }
    }

    public void addPrivateBaracoMethod(String identifier, TripleJFunction baracoMethod) {
        this.privateMethods.put(identifier, baracoMethod);
        System.out.println("Created private function " +identifier+ " with return type " + baracoMethod.getReturnType());
        MethodList.getInstance().addMethodName(identifier);
    }

    public void addPublicBaracoMethod(String identifier, TripleJFunction baracoMethod) {
        this.publicMethods.put(identifier, baracoMethod);
        System.out.println("Created public function " +identifier+ " with return type " + baracoMethod.getReturnType());
        MethodList.getInstance().addMethodName(identifier);
    }

    public void addBaracoValue(String accessControlModifier, String identifier, TripleJValue baracoValue) {
        boolean isPublic = true;

        if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.CLASS_MODIFIER_PRIVATE, accessControlModifier)) {
            isPublic = false;
        }

        if(isPublic){
            this.publicVariables.put(identifier, baracoValue);
        }
        else {
            this.privateVariables.put(identifier, baracoValue);
        }
    }

    public TripleJFunction getPublicMethod(String identifier) {
        if(this.containsPublicFunction(identifier)) {
            return this.publicMethods.get(identifier);
        }
        else {
            System.out.println(TAG + ": " + "Private " +identifier+ " function is not found.");
            return null;
        }
    }

    public TripleJFunction getPrivateMethod(String identifier) {
        if(this.containsPublicFunction(identifier)) {
            return this.privateMethods.get(identifier);
        }
        else {
            System.out.println(TAG + ": " + "Public " +identifier+ " function is not found");
            return null;
        }
    }

    public TripleJFunction searchMethod(String identifier) {
        if(this.containsPublicFunction(identifier)) {
            return this.publicMethods.get(identifier);
        }
        else if(this.containsPrivateFunction(identifier)) {
            return this.privateMethods.get(identifier);
        }
        else {
            System.out.println(TAG + ": " + identifier + " is not found in " +this.className);
            return null;
        }
    }

    public boolean containsPublicFunction(String identifier) {
        return this.publicMethods.containsKey(identifier);
    }

    public boolean containsPrivateFunction(String identifier) {
        return this.privateMethods.containsKey(identifier);
    }

    @Override
    /* Attempts to find a variable first in the private and public variable storage, then on the local scopes.
     * (non-Javadoc)
     * @see com.neildg.mobiprog.semantics.symboltable.scopes.IScope#getVariable(java.lang.String)
     */
    public TripleJValue searchVariableIncludingLocal(String identifier) {

        TripleJValue value;

        if(this.containsPrivateVariable(identifier)) {
            value = this.getPrivateVariable(identifier);
        }
        else if(this.containsPublicVariable(identifier)) {
            value = this.getPublicVariable(identifier);
        }
        else {
            value = LocalScopeCreator.searchVariableInLocalIterative(identifier, this.parentLocalScope);
        }

        return value;
    }

    public TripleJValue searchVariable(String identifier) {

        TripleJValue value = null;

        if(this.containsPrivateVariable(identifier)) {
            value = this.getPrivateVariable(identifier);
        }
        else if(this.containsPublicVariable(identifier)) {
            value = this.getPublicVariable(identifier);
        }

        return value;
    }

    public boolean containsPublicVariable(String identifier) {
        return this.publicVariables.containsKey(identifier);
    }

    public boolean containsPrivateVariable(String identifier) {
        return this.privateVariables.containsKey(identifier);
    }

    /*
     * Resets all stored variables. This is called after the execution manager finishes
     */
    public void resetValues() {
        TripleJValue[] publicBaracoValues = this.publicVariables.values().toArray(new TripleJValue[this.publicVariables.size()]);
        TripleJValue[] privateBaracoValues = this.privateVariables.values().toArray(new TripleJValue[this.privateVariables.size()]);

        for(int i = 0; i < publicBaracoValues.length; i++) {
            publicBaracoValues[i].reset();
        }

        for(int i = 0; i < privateBaracoValues.length; i++) {
            privateBaracoValues[i].reset();
        }
    }
}
