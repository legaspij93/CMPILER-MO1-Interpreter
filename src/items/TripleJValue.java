package items;

import com.udojava.evalex.Expression;

public class TripleJValue {
    public enum PrimitiveType{
        NOT_YET_IDENTIFIED,
        BOOL,
        INT,
        CHAR,
        FLOAT,
        STRING,
        ARRAY
    }

    //create getters
    private Object value;
    private PrimitiveType type = PrimitiveType.NOT_YET_IDENTIFIED;
    private boolean flag = false;

    public TripleJValue(Object value, PrimitiveType type) {
        if (value == null || checkType(value, type)) {
            this.value = value;
            this.type = type;

            if(this.type == PrimitiveType.INT || this.type == PrimitiveType.FLOAT || this.type == PrimitiveType.BOOL)
                tryEvaluate(value.toString());
        } else
            System.out.println("Value does not correspond to " + type + "!");
    }

    public Object getValue(){
        return this.value;
    }

    public PrimitiveType getType(){
        return this.type;
    }

    public void setType(PrimitiveType type){
        this.type = type;
    }

    public void setValue(String value){
        tryEvaluate(value);
    }

    public void setSCValue(String value){
        if(value.contains("\""))
            value = value.replaceAll("\"", "");
        else
            value = value.replaceAll("'", "");

        this.value = value;
    }

    public void markFlag(){
        this.flag = true;
    }

    public boolean isFlag() {
        return this.flag;
    }

    public static boolean checkValueType(Object value, PrimitiveType primitiveType) {
        switch(primitiveType) {
            case CHAR:
                return value instanceof Character;
            case BOOL:
                return value instanceof Boolean;
            case INT:
                return value instanceof Integer;
            case STRING:
                return value instanceof String;
            case ARRAY:
                return value instanceof Object;
            default:
                return false;
        }
    }

    private void tryEvaluate(String value){
        if(this.getType() == PrimitiveType.STRING || this.getType() == PrimitiveType.CHAR)
            this.value = value;
        else{
            try {
                this.value = new Expression(value).eval().toPlainString();
            }
            catch (Expression.ExpressionException e){

            }
        }
        System.out.println("EVAL: " + this.value.toString());
    }

    public static boolean checkType(Object value, PrimitiveType primitiveType){
        switch (primitiveType){
            case INT:
                return value instanceof Integer;
            case FLOAT:
                return value instanceof Float;
            case CHAR:
                return value instanceof Character;
            case STRING:
                return value instanceof String;
            case BOOL:
                return value instanceof Boolean;
            case ARRAY:
                return value instanceof Object;
            default:
                return false;
        }
    }

    private Object attemptTypeCast(String value){
        switch (this.type){
            case INT:
                return Integer.valueOf(value);
            case FLOAT:
                return Float.valueOf(value);
            case CHAR:
                return Character.valueOf(value.charAt(0));
            case STRING:
                return value;
            case BOOL:
                return Boolean.valueOf(value);
            default:
                return null;
        }
    }

    public static TripleJValue createEmptyVariableFromKeywords(String type) {

        //identify primitive type
        PrimitiveType primitiveType = PrimitiveType.NOT_YET_IDENTIFIED;

        if(type.contains(PrimitiveType.INT.toString())) {
            primitiveType = PrimitiveType.INT;
        }
        else if(type.contains(PrimitiveType.FLOAT.toString())) {
            primitiveType = PrimitiveType.FLOAT;
        }
        else if(type.contains(PrimitiveType.CHAR.toString())) {
            primitiveType = PrimitiveType.CHAR;
        }
        else if(type.contains(PrimitiveType.STRING.toString())) {
            primitiveType = PrimitiveType.STRING;
        }
        else if(type.contains(PrimitiveType.BOOL.toString())) {
            primitiveType = PrimitiveType.BOOL;
        }

        TripleJValue value = new TripleJValue(null, primitiveType);

        return value;
    }

    public static TripleJValue.PrimitiveType convertType(String type){
        if(type.contains(TripleJValue.PrimitiveType.INT.toString())){
            return TripleJValue.PrimitiveType.INT;
        }
        else if(type.contains(TripleJValue.PrimitiveType.FLOAT.toString())){
            return TripleJValue.PrimitiveType.FLOAT;
        }
        else if(type.contains(TripleJValue.PrimitiveType.CHAR.toString())){
            return TripleJValue.PrimitiveType.CHAR;
        }
        else if(type.contains(TripleJValue.PrimitiveType.STRING.toString())){
            return TripleJValue.PrimitiveType.STRING;
        }
        else if(type.contains(TripleJValue.PrimitiveType.BOOL.toString())){
            return TripleJValue.PrimitiveType.BOOL;
        }

        return PrimitiveType.NOT_YET_IDENTIFIED;
    }
}
