package com.thoughtworks.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MenuTest {
    private PrintStream printStream;
    private Menu menu;
    private BufferedReader reader;
    private Library library;
    private List<String> options;
    @Before
    public void setUp(){
        printStream = mock(PrintStream.class);
        reader = mock(BufferedReader.class);
        library = mock(Library.class);
        options = new ArrayList<>();
        menu = new Menu(printStream, reader, library, options);
    }

    @Test
    public void shouldDisplayMenuOptionsWhenAsked() {
        menu.addOption("1. List Books");
        menu.displayOptionsAndPromptUser();
        verify(printStream).println("1. List Books");
        verify(printStream).println("Please Enter An Option");
    }

    @Test
    public void shouldDisplayListOfBooksWhenUserSelectsOption1() throws IOException {
        when(reader.readLine()).thenReturn("1");
        menu.displayOptionsAndPromptUser();
        verify(library).printAllBookDetails();
    }
    @Test
    public void shouldHaveTwoOptionsWhenAnOptionIsAdded(){
        options.add("Option1");
        String optionTitle = "New Option";
       menu.addOption(optionTitle);
       assertEquals(options.size(), 2);
    }
    @Test
    public void shouldPrintInvalidMessageWhenUserInputsInvalidOptionAndAskToReEnter() throws IOException {
        when(reader.readLine()).thenReturn("asdkfj");
        menu.displayOptionsAndPromptUser();
        verify(printStream).println("Select a valid option!");
        verify(printStream).println("Please Enter An Option");
    }

}