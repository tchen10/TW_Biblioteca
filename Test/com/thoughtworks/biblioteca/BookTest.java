package com.thoughtworks.biblioteca;

import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BookTest {

    @Test
    public void shouldDisplayBookTitle() {
        PrintStream printStream = mock(PrintStream.class);
        Book book = new Book("Book Title", printStream);
        book.printTitle();

        verify(printStream).println("Book Title");
    }

    @Test
    public void shouldDisplayAllBookTitlesInBooksClass() {
        PrintStream printStream = mock(PrintStream.class);
        Book book1 = new Book("Book Title1", printStream);
        Book book2 = new Book("Book Title2", printStream);
        Book book3 = new Book("Book Title3", printStream);

        Book.printAllBookTitles();

        verify(printStream).println("Book Title1");
        verify(printStream).println("Book Title2");
        verify(printStream).println("Book Title3");
    }
}