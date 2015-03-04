package com.thoughtworks.biblioteca;

import java.io.PrintStream;

public class Book {
    private String title;
    private String author;
    private int yearPublished;
    private PrintStream printStream;


    public Book(String title, String author, int yearPublished, PrintStream printStream) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.printStream = printStream;
    }

    public void printTitle() {
        printStream.println(title);
    }

    public void printAllDetails() {

        String yearPublishedString = yearPublished + "";
        printStream.printf("%-10s %-10s %-10s\n", title, author, yearPublishedString);
    }



}
