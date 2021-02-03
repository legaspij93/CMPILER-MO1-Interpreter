package interpreter.utils;

import java.math.BigDecimal;
import interpreter.representations.*;

public class AssignmentUtils {
    public static void assignAppropriateValue(TripleJValue tripleJvalue, BigDecimal evaluationValue) {
        if(tripleJvalue.getPrimitiveType() == TripleJValue.PrimitiveType.INT) {
            tripleJvalue.setVal(Integer.toString(evaluationValue.intValue()));
        }
        else if(tripleJvalue.getPrimitiveType() == TripleJValue.PrimitiveType.DECIMAL) {
            tripleJvalue.setVal(Double.toString(evaluationValue.doubleValue()));
        }
        else if(tripleJvalue.getPrimitiveType() == TripleJValue.PrimitiveType.BOOL) {
            int result = evaluationValue.intValue();

            if(result == 1) {
                tripleJvalue.setVal(RecognizedKeywords.BOOLEAN_TRUE);
            }
            else {
                tripleJvalue.setVal(RecognizedKeywords.BOOLEAN_FALSE);
            }
        }
        else {
            System.out.println("AssignmentUtils: DID NOT FIND APPROPRIATE TYPE!!");
            //Console.log(LogType.DEBUG, "MobiValue: DID NOT FIND APPROPRIATE TYPE!!");
        }
    }

    public static void assignAppropriateValue(TripleJValue tripleJvalue, String stringValue) {
        if(tripleJvalue.getPrimitiveType() == TripleJValue.PrimitiveType.STRING ||
                tripleJvalue.getPrimitiveType() == TripleJValue.PrimitiveType.CHAR) {
            tripleJvalue.setVal(stringValue);
        }
    }

    public static void assignAppropriateValue(TripleJValue tripleJvalue, BigDecimal evaluationValue, int tokenSign) {
        if(tripleJvalue.getPrimitiveType() == TripleJValue.PrimitiveType.INT) {
            int toAssignValue = evaluationValue.intValue();
            int finalValue = Integer.parseInt(tripleJvalue.getVal().toString());

            if (tokenSign == TripleJLexer.ADD_ASSIGN) {
                finalValue += toAssignValue;
            }
            else if (tokenSign == TripleJLexer.SUB_ASSIGN) {
                finalValue -= toAssignValue;
            }
            else if (tokenSign == TripleJLexer.MUL_ASSIGN) {
                finalValue *= toAssignValue;
            }
            else if (tokenSign == TripleJLexer.DIV_ASSIGN) {
                finalValue /= toAssignValue;
            }
            else if (tokenSign == TripleJLexer.MOD_ASSIGN) {
                finalValue %= toAssignValue;
            }

            tripleJvalue.setVal(finalValue + "");
        }
        else if(tripleJvalue.getPrimitiveType() == TripleJValue.PrimitiveType.DECIMAL) {
            tripleJvalue.setVal(Double.toString(evaluationValue.doubleValue()));

            double toAssignValue = evaluationValue.intValue();
            double finalValue = Double.parseDouble(tripleJvalue.getVal().toString());

            if (tokenSign == BaracoLexer.ADD_ASSIGN) {
                finalValue += toAssignValue;
            }
            else if (tokenSign == BaracoLexer.SUB_ASSIGN) {
                finalValue -= toAssignValue;
            }
            else if (tokenSign == BaracoLexer.MUL_ASSIGN) {
                finalValue *= toAssignValue;
            }
            else if (tokenSign == BaracoLexer.DIV_ASSIGN) {
                finalValue /= toAssignValue;
            }
            else if (tokenSign == BaracoLexer.MOD_ASSIGN) {
                finalValue %= toAssignValue;
            }

            tripleJvalue.setVal(finalValue + "");
        }
    }

    public static void addAssignAppropriateValue(TripleJValue tripleJvalue, String stringValue) {
        if(tripleJvalue.getPrimitiveType() == TripleJValue.PrimitiveType.STRING) {
            String toAddValue = stringValue;
            String originalValue = tripleJvalue.getVal().toString();

            tripleJvalue.setVal(toAddValue + originalValue);
        }
    }
}
