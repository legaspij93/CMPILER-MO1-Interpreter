package interpreter.utils;

public class StringUtils {
    public static String removeQuotes(String stringWithQuotes) {
        String newString = stringWithQuotes.replace("\"", "");
        newString = newString.replace("'", "");

        return newString;
    }
}
