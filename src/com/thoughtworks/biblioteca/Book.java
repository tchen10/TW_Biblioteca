package com.thoughtworks.biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;

/**
 * Created by sradloff on 3/3/15.
 */
public class Book {
    private String title;
    private PrintStream printStream;
    private static ArrayList<Book> books = new ArrayList<Book>();

    public Book(String title, PrintStream printStream) {
        this.title = title;
        this.printStream = printStream;
        books.add(this);
    }

    public void printTitle() {
        printStream.println(title);
    }

    public static void printAllBookTitles(){
        for (Book book : books) {
            book.printTitle();
        }
    }

}
