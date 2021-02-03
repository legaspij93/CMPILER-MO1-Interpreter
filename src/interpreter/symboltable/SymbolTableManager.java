package interpreter.symboltable;

import java.util.HashMap;

public class SymbolTableManager {
    private static SymbolTableManager sharedInstance = null;
    private TripleJScope scope;

    public static SymbolTableManager getInstance() {
        if(sharedInstance == null)
            sharedInstance = new SymbolTableManager();
        return sharedInstance;
    }

    private SymbolTableManager() {
        scope = new TripleJScope();
    }

    public TripleJScope getTripleJScope(){
        return scope;
    }

//    public static void initialize() {
//        sharedInstance = new SymbolTableManager();
//    }
//
//    public static void reset() {
//        sharedInstance.classTable.clear();
//    }
//
//    public void addClassScope(String className, ClassScope classScope) {
//        this.classTable.put(className, classScope);
//    }
//
//    public ClassScope getClassScope(String className) {
//        if(this.containsClassScope(className)) {
//            return this.classTable.get(className);
//        }
//        else {
//            System.out.println(TAG + ": " + className + " is not found!");
//            return null;
//        }
//    }
//
//    public boolean containsClassScope(String className) {
//        return this.classTable.containsKey(className);
//    }
//
//    public void resetClassTables() {
//        ClassScope[] classScopes = this.classTable.values().toArray(new ClassScope[this.classTable.size()]);
//
//        for(int i = 0; i < classScopes.length; i++) {
//            classScopes[i].resetValues();
//        }
//    }
}
