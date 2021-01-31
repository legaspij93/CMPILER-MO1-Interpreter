package items;

import commands.INTCommand;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class TripleJMethod {
    public enum FunctionType{
        BOOL_TYPE,
        INT_TYPE,
        DECIMAL_TYPE,
        STRING_TYPE,
        CHAR_TYPE,
        VOID_TYPE
    }

    private String functionName;
    private ArrayList<INTCommand> commandList;
    private int level;
    private ArrayList<String> parameters;
    private FunctionType functionType;

    public void addCommand(INTCommand command) {
        this.commandList.add(command);
    }

}