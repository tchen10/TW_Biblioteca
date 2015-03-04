package com.thoughtworks.biblioteca;

import java.io.*;
import java.util.List;

public class Menu {


    private PrintStream printStream;
    private BufferedReader reader;
    private Library library;
    private List<String> options;

    public Menu(PrintStream printStream, BufferedReader reader, Library library, List<String> options) {

        this.printStream = printStream;
        this.reader = reader;
        this.library = library;
        this.options = options;
    }
    public void start(){
        displayOptionsAndPromptUser();

    }

    public void displayOptionsAndPromptUser() {
        for (String option : options) {
            printStream.println(option);
        }
        printStream.println("Please Enter An Option");
        String userInput;
        try {
            userInput = reader.readLine();
            outputResult(userInput);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void outputResult(String userInput) {
        if(userInput.equals("1")) {
            library.printAllBookDetails();
        }else{
            printStream.println("Select a valid option!");
            displayOptionsAndPromptUser();
            
        }
    }

    public void addOption(String optionTitle) {
        options.add(optionTitle);
    }
}
