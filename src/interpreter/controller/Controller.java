package interpreter.controller;

import GUI.View;
import interpreter.antlr.TripleJError;
import interpreter.builder.BuildChecker;
import interpreter.builder.ParserHandler;
import interpreter.execution.ExecutionManager;
import interpreter.symboltable.LocalScopeHandler;

import java.io.IOException;
import java.util.ArrayList;

public class Controller {
    private View view;

    public Controller(View view){
        this.view = view;
    }

    public void printErrorsInConsole(ArrayList<TripleJError> errors){
        for(int i = 0; i < errors.size(); i++){
            printErrorInConsole(errors.get(i));
        }
    }

    public void printErrorInConsole(TripleJError error){
        view.appendErrorInConsole(error);
    }

    public void run(String input, String fileName) throws IOException{
        ExecutionManager.reset();
        LocalScopeHandler.reset();
        BuildChecker.reset();
        StatementControlOverseer.reset();

        view.resetConsole();

        ParserHandler.getInstance().parseText(input);

        if(BuildChecker.getInstance().canExecute()){
            ExecutionManager.getInstance().executeAllActions();
            System.out.println("BuildChecker executed");
        }
        else
            System.out.println("Fix identified errors before executing!");

        public void buildOnly(String input, String fileName) throws IOException{
            ExecutionManager.reset();
            LocalScopeHandler.reset();
            BuildChecker.reset();
            StatementControlOverseer.reset();

            ParserHandler.getInstance().parseText(input);
        }
    }
}
