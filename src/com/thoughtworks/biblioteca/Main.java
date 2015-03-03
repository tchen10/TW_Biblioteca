package com.thoughtworks.biblioteca;

/**
 * Created by sradloff on 3/3/15.
 */
public class Main {
    public static void main(String[] args) {
        Welcome welcome = new Welcome(System.out);
        welcome.display();
        Book book1 = new Book("TDD", System.out);
        Book book2 = new Book("RoR", System.out);
        Book.printAllBookTitles();
    }
}
