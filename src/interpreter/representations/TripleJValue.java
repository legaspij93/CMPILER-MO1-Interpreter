package interpreter.representations;

import java.util.ArrayList;
import java.util.Stack;

public class TripleJValue {
    public enum PrimitiveType{
        NOT_YET_IDENTIFIED,
        BOOL,
        INT,
        FLOAT,
        CHAR,
        STRING,
        ARRAY
    }

    private Stack<Object> defaultVal;
    private Stack<Object> val;
    private PrimitiveType primitiveType = PrimitiveType.NOT_YET_IDENTIFIED;
    private boolean flag = false;

    public TripleJValue(Object val, PrimitiveType type){
        if(val == null || checkValType(val, type)){
            this.val = new Stack<Object>();

            this.val.push(val);
            this.primitiveType = type;
        }
        else
            System.out.println("Value is not appropriate for " + primitiveType + "!");
    }

    public void setPrimitiveType(PrimitiveType type){
        this.primitiveType = primitiveType;
    }

    public void reset(){
        this.val = this.defaultVal;
    }

    public Object popBack(){
        if(this.val.size() > 2)
            return this.val.pop();

        return null;
    }

    public int stackSize(){
        return val.size();
    }

    public void markFlag(){
        this.flag = true;
    }

    public boolean isFlag(){
        return this.flag;
    }

    public void setVal(String val){
        if(this.primitiveType == PrimitiveType.NOT_YET_IDENTIFIED)
            System.out.println("Primitive type not yet defined");
        else if(this.primitiveType == PrimitiveType.STRING){
            val.replace("\"", "");

            this.val.push(val.replace("\"", ""));
        }
        else if(this.primitiveType == PrimitiveType.ARRAY)
            System.out.println(this.primitiveType + "is an array. Cannot directly alter value.");
        else
            this.val.push(this.attemptTypeCast(val));
    }

    private Object attemptTypeCast(String val){
        switch (this.primitiveType){
            case INT:
                String s = val;

                if(s.contains(".")){
                    String[] split = s.split("[.]");
                    return Integer.valueOf(split[0]);
                }
                else
                    return Integer.valueOf(val);
            case FLOAT:
                return Float.valueOf(val);
            case CHAR:
                return Character.valueOf(val.charAt(0));
            case STRING:
                return val;
            default:
                return null;
        }
    }

    public Object getVal(){
        return this.val.peek();
    }

    public PrimitiveType getPrimitiveType(){
        return this.primitiveType;
    }

    public static boolean checkValType(Object val, PrimitiveType type){
        switch (type){
            case INT:
                return val instanceof Integer;
            case FLOAT:
                return val instanceof Float;
            case CHAR:
                return val instanceof Character;
            case STRING:
                return val instanceof String;
            case BOOL:
                return val instanceof Boolean;
            case ARRAY:
                return val instanceof Object;
            default:
                return false;
        }
    }

    public static TripleJValue createEmptyVariableFromKeywords(String typeString){
        PrimitiveType type = PrimitiveType.NOT_YET_IDENTIFIED;

        if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.PRIMITIVE_TYPE_BOOLEAN, typeString))
            type = PrimitiveType.BOOL;
        else if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.PRIMITIVE_TYPE_CHAR, typeString))
            type = PrimitiveType.CHAR;
        else if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.PRIMITIVE_TYPE_DECIMAL, typeString))
            type = PrimitiveType.FLOAT;
        else if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.PRIMITIVE_TYPE_INT, typeString))
            type = PrimitiveType.INT;
        else if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.PRIMITIVE_TYPE_STRING, typeString))
            type = PrimitiveType.STRING;

        TripleJValue tripleJValue = new TripleJValue(null, type);

        return tripleJValue;
    }
}
