package interpreter.representations;

import grammar.TripleJParser;
import interpreter.commands.ICommand;
import interpreter.commands.IControlledCommand;
import interpreter.errorChecker.TypeChecker;
import interpreter.execution.ExecutionManager;
import interpreter.execution.ExecutionMonitor;
import interpreter.execution.FunctionTracker;
import interpreter.symboltable.TripleJScope;
import interpreter.utils.LocalVarTracker;
import interpreter.commands.IfCommand;
import interpreter.commands.ReturnCommand;
import interpreter.symboltable.ClassScope;
import interpreter.symboltable.LocalScope;
import interpreter.utils.LocalVarTracker;
import org.antlr.v4.runtime.misc.Triple;

import java.lang.invoke.MethodType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class TripleJFunction implements IControlledCommand {
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

    private LinkedHashMap<String, TripleJScope> parameterReferences;
    private LinkedHashMap<String, TripleJValue> parameterValues;
    private TripleJValue returnVal;
    private FunctionType returnType = FunctionType.VOID;

//    private boolean hasValidReturns = true;

    public TripleJFunction(){
        this.commandList = new ArrayList<ICommand>();
        this.parameterValues = new LinkedHashMap<String, TripleJValue>();
        this.parameterReferences = new LinkedHashMap<String, TripleJScope>();
    }

    public void setParentLocalScope(LocalScope localScope) {
        this.parentLocal = localScope;
    }

    public LocalScope getParentLocalScope() {
        return this.parentLocal;
    }

    public void setReturnType(FunctionType type) {
        this.returnType = type;

        switch(this.returnType) {
            case BOOL: this.returnVal = new TripleJValue(true, TripleJValue.PrimitiveType.BOOL); break;
            case INT: this.returnVal = new TripleJValue(0, TripleJValue.PrimitiveType.INT); break;
            case FLOAT: this.returnVal = new TripleJValue(0.0, TripleJValue.PrimitiveType.FLOAT); break;
            case STRING: this.returnVal = new TripleJValue("", TripleJValue.PrimitiveType.STRING); break;
            case CHAR: this.returnVal = new TripleJValue(0, TripleJValue.PrimitiveType.CHAR); break;
            default:
                break;
        }
    }

//    public boolean hasValidReturns(){
//        return this.hasValidReturns;
//    }

//    public void setValidReturns(boolean b) {
//        hasValidReturns = b;
//    }

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
            val.setVal(values[i]);
        }
    }

    public void mapParameterByValueAt(String value, int index) {
        if(index >= this.parameterValues.size()) {
            return;
        }

        TripleJValue val = this.getParameterAt(index);
        val.setVal(value);
    }

    public void mapArrayAt(TripleJValue val, int index, String identifier) {
        if(index >= this.parameterValues.size()) {
            return;
        }

        TripleJArray array = (TripleJArray) val.getVal();

        TripleJArray newArray = new TripleJArray(array.getPrimitiveType(), identifier);
        TripleJValue newValue = new TripleJValue(newArray, TripleJValue.PrimitiveType.ARRAY);

        newArray.initializeSize(array.getSize());

        for(int i = 0; i < newArray.getSize(); i++) {
            newArray.updateValueAt(array.getValueAt(i), i);
        }

        this.parameterValues.put(this.getParameterKeyAt(index), val);

    }

    public int getParameterValueSize() {
        return this.parameterValues.size();
    }

    public void verifyParameterByValueAt(TripleJParser.ExpressionContext exprCtx, int index) {
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
//        System.out.println(this.funcName + " added an empty parameter " +identifierString+ " type " + value.getPrimitiveType());
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
            System.out.println(this.funcName + " is a void function. Null value is returned");
            return null;
        }
        else {
            return this.returnVal;
        }
    }

    @Override
    public void addCommand(ICommand command) {
        this.commandList.add(command);
        //Console.log("Command added to " +this.functionName);
    }

    @Override
    public void execute() {
        ExecutionMonitor executionMonitor = ExecutionManager.getInstance().getExecutionMonitor();
        FunctionTracker.getInstance().reportEnterFunction(this);

        try {
            for(ICommand command : this.commandList) {
                executionMonitor.tryExec();
                command.execute();
            }
        } catch(InterruptedException e) {
            System.err.println(TAG + ": " + "Monitor block interrupted! " +e.getMessage());
        }

        FunctionTracker.getInstance().reportExit();
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
