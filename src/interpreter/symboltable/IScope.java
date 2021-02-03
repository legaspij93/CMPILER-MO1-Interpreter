package interpreter.symboltable;

import interpreter.representations.TripleJValue;

public interface IScope {
    public abstract TripleJValue searchVariableIncludingLocal(String identifier);
    public abstract boolean isParent();
}
