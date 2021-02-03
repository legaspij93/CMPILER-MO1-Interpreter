package interpreter.symboltable;

import interpreter.representations.TripleJValue;

public interface INTScope {
    public abstract TripleJValue searchVariableIncludingLocal(String identifier);
    public abstract boolean isParent();
}
