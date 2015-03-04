package com.thoughtworks.biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    private PrintStream printStream;

    public Library(PrintStream printStream, List<Book> books) {
        this.printStream = printStream;
        this.books = books;
    }

    public void printAllBookDetails() {
        printStream.printf("%-10s %-10s %-10s\n", "Title", "Author", "Year Published");
        for (Book book : books) {
            book.printAllDetails();
        }
    }
}
