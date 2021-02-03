package interpreter.templates;

public class TripleJFunctionTemplateParameter {
    public String paramName;
    public String dataType;

    public TripleJFunctionTemplateParameter(){

    }

    public TripleJFunctionTemplateParameter(String name, String type){
        this.paramName = name;
        this.dataType = type;
    }

    public String getParamName(){
        return paramName;
    }

    public TripleJFunctionTemplateParameter setParamName(String name){
        this.paramName = name;
        return this;
    }

    public String getDataType(){
        return dataType;
    }

    public TripleJFunctionTemplateParameter setDataType(String type){
        this.dataType = type;
        return this;
    }

    @Override
    public String toString(){
        return dataType + " " + paramName;
    }
}
