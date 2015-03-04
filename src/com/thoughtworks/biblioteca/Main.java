package com.thoughtworks.biblioteca;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Welcome welcome = new Welcome(System.out);
        welcome.display();


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> options = new ArrayList<>();
        Menu menu = new Menu(System.out, reader,library(), options);
        menu.start();

    }

    private static Library library() {
        Book book1 = new Book("TDD", "Kent Beck", 2000, System.out);
        Book book2 = new Book("RoR", "Katz", 2005, System.out);
        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        return new Library(System.out, books);
    }
}
