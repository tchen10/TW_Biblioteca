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
        Book book = new Book("Book Title", "Author", 1970, printStream);
        book.printTitle();

        verify(printStream).println("Book Title");
    }


    @Test
    public void shouldDisplayAllBookDetailsForOneBook() {
        PrintStream printStream = mock(PrintStream.class);
        Book book1 = new Book("Book Title1", "Author1", 2001, printStream);

        book1.printAllDetails();

        verify(printStream).println("Book Title1 | Author1 | 2001");
    }


}