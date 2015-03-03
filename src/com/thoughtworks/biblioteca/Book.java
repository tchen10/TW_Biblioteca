package com.thoughtworks.biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;

/**
 * Created by sradloff on 3/3/15.
 */
public class Book {
    private String title;
    private String author;
    private int yearPublished;
    private PrintStream printStream;
    private static PrintStream classPrintStream;
    private static ArrayList<Book> books = new ArrayList<Book>();

    public Book(String title, String author, int yearPublished, PrintStream printStream) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.printStream = printStream;
        classPrintStream = printStream;
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

    public static void printAllBookDetails() {
        classPrintStream.println("Title | Author | Year Published");
        for (Book book : books) {
            book.printAllDetails();
        }
    }

    public void printAllDetails() {
        printStream.println(title + " | " + author + " | " + yearPublished);
    }



}
