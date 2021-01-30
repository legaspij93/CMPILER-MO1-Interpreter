package Items;

public class TripleJArray {

    private String name;
    private TripleJValue[] valueArray;
    private TripleJValue.PrimitiveType type;
    private boolean flag = false;

    public TripleJArray(TripleJValue.PrimitiveType type){
        this.type = type;
    }

    public TripleJArray(String type){
        if(type.contains(TripleJValue.PrimitiveType.INT.toString())){
            this.type = TripleJValue.PrimitiveType.INT;
        }
        else if(type.contains(TripleJValue.PrimitiveType.FLOAT.toString())){
            this.type = TripleJValue.PrimitiveType.FLOAT;
        }
        else if(type.contains(TripleJValue.PrimitiveType.CHAR.toString())){
            this.type = TripleJValue.PrimitiveType.CHAR;
        }
        else if(type.contains(TripleJValue.PrimitiveType.STRING.toString())){
            this.type = TripleJValue.PrimitiveType.STRING;
        }
        else if(type.contains(TripleJValue.PrimitiveType.BOOL.toString())){
            this.type = TripleJValue.PrimitiveType.BOOL;
        }
    }

    public TripleJValue.PrimitiveType getType(){
        return this.type;
    }

    public int getSize(){
        return this.valueArray.length;
    }

    public void setType(TripleJValue.PrimitiveType type){
        this.type = type;
    }

    public void markFlag(){
        this.flag = true;
    }

    public boolean isFinal(){
        return this.flag;
    }

    public void initialize(int size){
        try{
            this.valueArray = new TripleJValue[size];
        }
        catch (NegativeArraySizeException e){
            this.valueArray = null;
        }
    }

    public static TripleJArray generateArray(String typeString, String identifier){
        TripleJValue.PrimitiveType type = TripleJValue.PrimitiveType.NOT_YET_IDENTIFIED;

        if(typeString.contains(TripleJValue.PrimitiveType.INT.toString())) {
            type = TripleJValue.PrimitiveType.INT;
        }
        else if(typeString.contains(TripleJValue.PrimitiveType.FLOAT.toString())) {
            type = TripleJValue.PrimitiveType.FLOAT;
        }
        else if(typeString.contains(TripleJValue.PrimitiveType.CHAR.toString())) {
            type = TripleJValue.PrimitiveType.CHAR;
        }
        else if(typeString.contains(TripleJValue.PrimitiveType.STRING.toString())) {
            type = TripleJValue.PrimitiveType.STRING;
        }
        else if(typeString.contains(TripleJValue.PrimitiveType.BOOL.toString())) {
            type = TripleJValue.PrimitiveType.INT;
        }

        TripleJArray array = new TripleJArray(type);

        return array;
    }

    public TripleJValue getValue(int index){
        if(index < 0 ||index >= this.valueArray.length){
            System.out.println("Out of bounds");
            return null;
        }
        else
            return this.valueArray[index];
    }

    public void updateValue(TripleJValue value, int index){
        if(index < 0 ||index >= this.valueArray.length){
            System.out.println("Out of bounds");
            return;
        }

        this.valueArray[index] = value;
    }
}