package com.thoughtworks.biblioteca;


import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class WelcomeTest {
    @Test
    public void shouldPrintWelcomeMessageWhenDisplayed(){
        PrintStream printStream = mock(PrintStream.class);

        Welcome welcome = new Welcome(printStream);
        welcome.display();

        verify(printStream).println("Welcome to Biblioteca!");
    }

}