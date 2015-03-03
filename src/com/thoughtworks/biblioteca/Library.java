package com.thoughtworks.biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;

/**
 * Created by sradloff on 3/3/15.
 */
public class Library {
    private ArrayList<Book> books = new ArrayList<Book>();
    private PrintStream printStream;

    public void printAllBookDetails() {
        printStream.println("Title | Author | Year Published");
        for (Book book : books) {
            book.printAllDetails();
        }
    }
}
