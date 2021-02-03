package interpreter.representations;

public class TripleJValueSearcher {
    private final static String TAG = "TripleJValueSearcher";

    public static TripleJValue searchBaracoValue(String identifier) {

        TripleJValue value = null;

        if(MethodTracker.getInstance().isInsideFunction()) {
            TripleJFunction function = MethodTracker.getInstance().getLatestFunction();

            if(function.hasParameter(identifier)) {
                value =  function.getParameter(identifier);
            }
            else {
                value = LocalScopeCreator.searchVariableInLocalIterative(identifier, function.getParentLocalScope());
            }
        }

        if(value == null) {
            ClassScope classScope = SymbolTableManager.getInstance().getClassScope(ParserHandler.getInstance().getCurrentClassName());
            value = classScope.searchVariableIncludingLocal(identifier);
        }

        return value;

    }
}
