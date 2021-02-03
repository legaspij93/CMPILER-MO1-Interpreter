package interpreter.templates;

import java.util.ArrayList;

public class TripleJFunctionTemplate {
    public String funcName;
    public String returnType;
    public boolean isPublic;
    ArrayList<TripleJFunctionTemplateParameter> params;

    public TripleJFunctionTemplate(){
        this.params = new ArrayList<>();
    }

    private String getFuncName(){
        return this.funcName;
    }

    public TripleJFunctionTemplate setFuncName(String name){
        this.funcName = name;
        return this;
    }

    public TripleJFunctionTemplate setReturnType(String type){
        this.returnType = type;
        return this;
    }

    public TripleJFunctionTemplate setIsPublic(boolean isPublic){
        this.isPublic = isPublic;
        return this;
    }

    public TripleJFunctionTemplate addParameter(TripleJFunctionTemplateParameter parameter) {
        this.params.add(parameter);
        return this;
    }

    public boolean hasParameter(TripleJFunctionTemplateParameter parameter) {
        for (TripleJFunctionTemplateParameter param : params) {
            if (param.getParamName().equals(parameter.getParamName())) {
                return true;
            }
        }

        return false;
    }

    @Override
    public String toString() {
        String func = "\t" + (isPublic ? "public " : "private ") + returnType + " " + funcName + "(";

        for (int i = 0; i < params.size() - 1; i++) {
            func += params.get(i).toString() + ", ";
        }

        if (params.size() > 0) {
            func += params.get(params.size() - 1).toString();
        }

        func += "):\n\t\t" +
                "// Code goes here";

        func += "\n\tend";


        return func;
    }
}
