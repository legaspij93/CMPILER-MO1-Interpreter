package items;

import java.util.ArrayList;

public class TripleJFunction {
    public enum FunctionType{
        BOOL,
        INT,
        FLOAT,
        STRING,
        VOID
    }
    private String functionName;
    ArrayList<Object> parameters;

    public TripleJFunction(String name, ArrayList<Object> variables){
        this.functionName = name;
        this.parameters = variables;
    }
}