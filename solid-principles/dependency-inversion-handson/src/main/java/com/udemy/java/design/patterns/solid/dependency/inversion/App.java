package com.udemy.java.design.patterns.solid.dependency.inversion;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Formatter;

public class App {

    public static void main(String... args) {

        var printer = new MessagePrinter();
        var formatter = new JSONFormatter();
        var msg = new Message("This is a message");

        //
        try (var writer = new PrintWriter(System.out)) {
            printer.writerMessage(msg, formatter, writer);
        }

    }
}
