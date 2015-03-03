package com.thoughtworks.biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;

/**
 * Created by sradloff on 3/3/15.
 */
public class Library {
    private ArrayList<Book> books = new ArrayList<Book>();
    private PrintStream printStream;
    private String name;

    public Library(PrintStream printStream){
        this.name = "Biblioteca";
        this.printStream = printStream;
    }
    public void printAllBookDetails() {
        printStream.println("Title | Author | Year Published");
        for (Book book : books) {
            book.printAllDetails();
        }
    }

    public void addBook(Book book){
        books.add(book);
    }

    public ArrayList<Book> getBooks(){
        return books;
    }
}
