package com.thoughtworks.biblioteca;

import java.io.PrintStream;

/**
 * Created by sradloff on 3/3/15.
 */
public class Welcome {

    private PrintStream printStream;

    public Welcome(PrintStream printStream){
        this.printStream = printStream;
    }

    public void display(){
        printStream.println("Welcome to Biblioteca!");
    }
}
