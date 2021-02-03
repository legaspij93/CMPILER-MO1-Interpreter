package interpreter.representations;

import org.antlr.v4.runtime.misc.Triple;

import java.lang.invoke.MethodType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class TripleJFunction implements IControlledCommand{
    private final static String TAG = "TripleJFunction";

    public enum FunctionType{
        BOOL,
        INT,
        FLOAT,
        CHAR,
        STRING,
        VOID
    }

    private String funcName;
    private List<ICommand> commandList;

    private LocalScope parentLocal;

    private LinkedHashMap<String, ClassScope> parameterReferences;
    private LinkedHashMap<String, TripleJValue> parameterValues;
    private TripleJValue returnVal;
    private FunctionType returnType = FunctionType.VOID;

    private boolean hasValidReturns = true;

    public TripleJFunction(){
        this.commandList = new ArrayList<ICommand>();
        this.parameterValues = new LinkedHashMap<String, TripleJValue>();
        this.parameterReferences = new LinkedHashMap<String, ClassScope>();
    }

    public void setParentLocalScope(LocalScope localScope) {
        this.parentLocalScope = localScope;
    }

    public LocalScope getParentLocalScope() {
        return this.parentLocalScope;
    }

    public void setReturnType(FunctionType type) {
        this.returnType = type;

        switch(this.returnType) {
            case BOOL: this.returnVal = new TripleJValue(true, TripleJValue.PrimitiveType.BOOL); setValidReturns(false); break;
            case INT: this.returnVal = new TripleJValue(0, TripleJValue.PrimitiveType.INT); setValidReturns(false); break;
            case FLOAT: this.returnVal = new TripleJValue(0.0, TripleJValue.PrimitiveType.FLOAT); setValidReturns(false); break;
            case STRING: this.returnVal = new TripleJValue("", TripleJValue.PrimitiveType.STRING); setValidReturns(false); break;
            case CHAR: this.returnVal = new TripleJValue(0, TripleJValue.PrimitiveType.CHAR); setValidReturns(false); break;
            default:
                break;
        }
    }

    public boolean hasValidReturns(){
        return this.hasValidReturns;
    }

    public void setValidReturns(boolean b) {
        hasValidReturns = b;
    }

    public FunctionType getReturnType() {
        return this.returnType;
    }

    public void setFuncName(String name) {
        this.funcName = name;
    }

    public String getFuncName() {
        return this.funcName;
    }

    public void mapParameterByValue(String... values) {
        for(int i = 0; i < values.length; i++) {
            TripleJValue val = this.getParameterAt(i);
            val.setValue(values[i]);
        }
    }

    public void mapParameterByValueAt(String value, int index) {
        if(index >= this.parameterValues.size()) {
            return;
        }

        TripleJValue val = this.getParameterAt(index);
        val.setValue(value);
    }

    public void mapArrayAt(TripleJValue val, int index, String identifier) {
        if(index >= this.parameterValues.size()) {
            return;
        }

        /*BaracoArray baracoArray = (BaracoArray) baracoValue.getValue();
        BaracoArray newArray = new BaracoArray(baracoArray.getPrimitiveType(), identifier);
        BaracoValue newValue = new BaracoValue(newArray, PrimitiveType.ARRAY);
        newArray.initializeSize(baracoArray.getSize());
        for(int i = 0; i < newArray.getSize(); i++) {
            newArray.updateValueAt(baracoArray.getValueAt(i), i);
        }*/

        this.parameterValues.put(this.getParameterKeyAt(index), val);

    }

    public int getParameterValueSize() {
        return this.parameterValues.size();
    }

    public void verifyParameterByValueAt(ExpressionContext exprCtx, int index) {
        if(index >= this.parameterValues.size()) {
            return;
        }

        TripleJValue val = this.getParameterAt(index);
        TypeChecker typeChecker = new TypeChecker(val, exprCtx);
        typeChecker.verify();
    }

    /*
     * Maps parameters by reference, in this case, accept a class scope.
     */
    public void mapParameterByReference(ClassScope... classScopes) {
        //Log.e(TAG, "Mapping of parameter by reference not yet supported.");
    }

    public void addParameter(String identifierString, TripleJValue value) {
        this.parameterValues.put(identifierString, value);
        System.out.println(this.funcName + " added an empty parameter " +identifierString+ " type " + value.getPrimitiveType());
    }

    public boolean hasParameter(String identifierString) {
        return this.parameterValues.containsKey(identifierString);
    }
    public TripleJValue getParameter(String identifierString) {
        if(this.hasParameter(identifierString)) {
            return this.parameterValues.get(identifierString);
        }
        else {
            System.out.println(TAG + ": " + identifierString + " not found in parameter list");
            return null;
        }
    }

    public TripleJValue getParameterAt(int index) {
        int i = 0;

        for(TripleJValue value : this.parameterValues.values()) {
            if(i == index) {
                return value;
            }

            i++;
        }

        System.out.println(TAG + ": " + index + " has exceeded parameter list.");
        return null;
    }

    private String getParameterKeyAt(int index) {
        int i = 0;

        for(String key : this.parameterValues.keySet()) {
            if(i == index) {
                return key;
            }

            i++;
        }

        System.out.println(TAG + ": " + index + " has exceeded parameter list.");
        return null;
    }

    public TripleJValue getReturnValue() {
        if(this.returnType == FunctionType.VOID) {
            System.out.println(this.funcName + " is a void function. Null mobi value is returned");
            return null;
        }
        else {
            return this.returnVal;
        }
    }

    @Override
    public void addCommand(ICommand command) {
        this.commandSequences.add(command);
        //Console.log("Command added to " +this.functionName);
    }

    @Override
    public void execute() {
        ExecutionMonitor executionMonitor = ExecutionManager.getInstance().getExecutionMonitor();
        MethodTracker.getInstance().reportEnterFunction(this);

        LocalVarTracker.getInstance().startNewSession();

        try {
            for(ICommand command : this.commandSequences) {
                executionMonitor.tryExecution();
                command.execute();

                LocalVarTracker.getInstance().populateLocalVars(command);

                if (command instanceof ReturnCommand) {
                    break;
                } else if (command instanceof IfCommand) {
                    if (((IfCommand) command).isReturned()) {
                        ((IfCommand) command).resetReturnFlag();
                        break;
                    }
                }

                if (ExecutionManager.getInstance().isAborted())
                    break;
            }
        } catch(InterruptedException e) {
            System.out.println(TAG + ": " + "Monitor block interrupted! " +e.getMessage());
        }

        MethodTracker.getInstance().reportExitFunction();
        this.popBackParameters();
        this.popBackLocalVars();

        LocalVarTracker.getInstance().endCurrentSession();

        //LocalVarTracker.resetLocalVars(localVars);
    }

    private void popBackParameters() {
        for (TripleJValue bV : this.parameterValues.values()) {
            if(bV.getPrimitiveType() != TripleJValue.PrimitiveType.ARRAY)
                bV.popBack();
        }
    }

    private void popBackLocalVars() {
        for(String s : LocalVarTracker.getInstance().getCurrentSession()) {

            TripleJValue value = VariableSearcher.searchVariableInFunction(this, s);

            if (value != null) {

                if (value.stackSize() > 1) { // prevent from reaching null
                    if (value.getPrimitiveType() != TripleJValue.PrimitiveType.ARRAY)
                        value.popBack();
                }

            }

        }
    }

    @Override
    public ControlTypeEnum getControlType() {
        return ControlTypeEnum.FUNCTION_TYPE;
    }

    public static FunctionType identifyFunctionType(String primitiveTypeString) {

        if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.PRIMITIVE_TYPE_BOOLEAN, primitiveTypeString)) {
            return FunctionType.BOOL;
        }
        else if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.PRIMITIVE_TYPE_CHAR, primitiveTypeString)) {
            return FunctionType.CHAR;
        }
        else if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.PRIMITIVE_TYPE_DECIMAL, primitiveTypeString)) {
            return FunctionType.FLOAT;
        }
        else if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.PRIMITIVE_TYPE_INT, primitiveTypeString)) {
            return FunctionType.INT;
        }
        else if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.PRIMITIVE_TYPE_STRING, primitiveTypeString)) {
            return FunctionType.STRING;
        }

        return FunctionType.VOID;
    }
}
