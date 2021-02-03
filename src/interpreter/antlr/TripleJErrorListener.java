package interpreter.antlr;

import interpreter.controller.Controller;
import org.antlr.v4.runtime.BaseErrorListener;

import java.util.ArrayList;

public class TripleJErrorListener extends BaseErrorListener {
    private ArrayList<TripleJError> errors;
    private Controller controller;

    public TripleJErrorListener(Controller controller){
        errors = new ArrayList<TripleJError>();

        this.controller = controller;
    }
}
