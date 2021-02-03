package interpreter.representations;

import grammar.TripleJParser;
import interpreter.execution.FunctionTracker;
import interpreter.symboltable.LocalScopeHandler;
import interpreter.symboltable.SymbolTableManager;
import interpreter.symboltable.TripleJScope;

public class TripleJValueSearcher {
    public static TripleJValue searchVariable(String identifierString) {
        TripleJValue tripleJValue = null;

        if(FunctionTracker.getInstance().isInsideFunction()) {
            tripleJValue = searchVariableInFunction(FunctionTracker.getInstance().getLatestFunction(), identifierString);
        }

        if(tripleJValue == null) {
            TripleJScope tripleJScope = SymbolTableManager.getInstance().getCorgiScope();
            tripleJValue = searchVariableInClassIncludingLocal(tripleJScope, identifierString);
        }

        return tripleJValue;
    }

    public static TripleJValue searchVariableInFunction(TripleJFunction mobiFunction, String identifierString) {
        TripleJValue tripleJValue = null;

        if(mobiFunction.hasParameter(identifierString)) {
            tripleJValue = mobiFunction.getParameter(identifierString);
        }
        else {
            tripleJValue = LocalScopeHandler.searchVariableInLocalIterative(identifierString, mobiFunction.getParentLocalScope());
        }

        return tripleJValue;
    }

    public static TripleJValue searchVariableInClassIncludingLocal(TripleJScope tripleJScope, String identifierString) {
        return tripleJScope.searchVariableIncludingLocal(identifierString);
    }

    public static TripleJValue searchVariableInClass(TripleJScope tripleJScope, String identifierString) {
        return tripleJScope.getVariable(identifierString);
    }
}
