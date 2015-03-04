package com.thoughtworks.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class LibraryTest {

    private PrintStream printStream;
    private Library library;
    private List<Book> books;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        books = new ArrayList<>();
        library = new Library(printStream, books);
    }

    @Test
    public void shouldAddOneBookToBooksArrayList(){
        Book book = addBookToLibrary();
        library.printAllBookDetails();
        verify(book).printAllDetails();
    }

    @Test
    public void shouldDisplayAllBookDetailsForAllBooksInBooksClass() {
        Book book = addBookToLibrary();
        Book book2 = addBookToLibrary();

        library.printAllBookDetails();

        verify(book).printAllDetails();
        verify(book2).printAllDetails();
    }

    @Test
    public void shouldDisplayListHeaderForBookDetails() {
        library.printAllBookDetails();
        verify(printStream).printf("%-10s %-10s %-10s\n", "Title", "Author", "Year Published");
    }

    private Book addBookToLibrary() {
        Book book = mock(Book.class);
        books.add(book);
        return book;
    }

}