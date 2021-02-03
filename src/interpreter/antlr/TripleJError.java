package interpreter.antlr;

import javax.lang.model.type.ErrorType;

public class TripleJError {
    public static final String NO_VIABLE_ALT_KEY = "no viable alternative at input";
    public static final String MISSING_KEY = "missing";
    public static final String MISMATCHED_INPUT_KEY = "mismatched input";
    public static final String EXTRANEOUS_INPUT_KEY = "extraneous input";
    public static final String TOKEN_RECOGNITION_KEY = "token recognition error";

    private int lineNum;
    private int charNum;
    private String errorPrefix;
    private String lineLayout;
    private String errorSuffix;
    private ErrorType type;

    public enum ErrorType{
        NO_VIABLE_ALTERNATIVE,
        MISSING,
        MISMATCHED_INPUT,
        EXTRANEOUS_INPUT,
        TOKEN_RECOGNITION
    }

    public int getLineNum(){
        return lineNum;
    }

    public void setLineNum(int lineNum){
        this.lineNum = lineNum;
    }

    public int getCharNum(){
        return charNum;
    }

    public void setCharNum(int charNum){
        this.charNum = charNum;
    }

    public String getErrorPrefix(){
        return errorPrefix;
    }

    public void setErrorPrefix(String errorPrefix){
        this.errorPrefix = errorPrefix;
    }

    public String getLineLayout() {
        return lineLayout;
    }

    public void setLineLayout(String lineLayout) {
        this.lineLayout = lineLayout;
    }

    public String getErrorSuffix() {
        return errorSuffix;
    }

    public void setErrorSuffix(String errorSuffix) {
        this.errorSuffix = errorSuffix;
    }

    public ErrorType getType(){
        return type;
    }

    public void setType(ErrorType type){
        this.type = type;
    }

}
