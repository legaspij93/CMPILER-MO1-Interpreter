package interpreter.representations;

import interpreter.execution.ExecutionManager;

public class TripleJArray {
    private final static String TAG = "TripleJArray";

    private TripleJValue[] tripleJValues;
    private TripleJValue.PrimitiveType arrayType;
    private String identifier;
    private boolean flag = false;

    public TripleJArray(TripleJValue.PrimitiveType type, String identifier){
        this.arrayType = type;
        this.identifier = identifier;
    }

    public void setPrimitiveType(TripleJValue.PrimitiveType type) {
        this.arrayType = type;
    }

    public TripleJValue.PrimitiveType getPrimitiveType() {
        return this.arrayType;
    }

    public void markFlag() {
        this.flag = true;
    }

    public boolean isFlag() {
        return this.flag;
    }

    public void initializeSize(int size) {
        this.tripleJValues = new TripleJValue[size];
        System.err.println("Array initialized to size " + this.tripleJValues.length);
    }

    public int getSize() {
        return this.tripleJValues.length;
    }

    public void updateValueAt(TripleJValue value, int index) {
        if(index >= this.tripleJValues.length) {
//            ExecutionManager.getInstance().setCurrentCatchType(IAttemptCommand.CatchTypeEnum.ARRAY_OUT_OF_BOUNDS);
            return;
        }
        this.tripleJValues[index] = value;
    }

    public TripleJValue getValueAt(int index) {
        if(index >= this.tripleJValues.length) {
//            ExecutionManager.getInstance().setCurrentCatchType(IAttemptCommand.CatchTypeEnum.ARRAY_OUT_OF_BOUNDS);
            return this.tripleJValues[this.tripleJValues.length-1];
        }
        else {
            return this.tripleJValues[index];
        }
    }

    /*
     * Utility function that returns an array of specified primitive type.
     */
    public static TripleJArray createArray(String primitiveTypeString, String arrayIdentifier) {
        //identify primitive type
        TripleJValue.PrimitiveType type = TripleJValue.PrimitiveType.NOT_YET_IDENTIFIED;

        if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.PRIMITIVE_TYPE_BOOLEAN, primitiveTypeString))
            type = TripleJValue.PrimitiveType.BOOL;
        else if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.PRIMITIVE_TYPE_CHAR, primitiveTypeString)) {
            type = TripleJValue.PrimitiveType.CHAR;
        }
        else if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.PRIMITIVE_TYPE_DECIMAL, primitiveTypeString)) {
            type = TripleJValue.PrimitiveType.FLOAT;
        }
        else if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.PRIMITIVE_TYPE_INT, primitiveTypeString)) {
            type = TripleJValue.PrimitiveType.INT;
        }
        else if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.PRIMITIVE_TYPE_STRING, primitiveTypeString)) {
            type = TripleJValue.PrimitiveType.STRING;
        }

        TripleJArray array = new TripleJArray(type, arrayIdentifier);

        return array;
    }
}
