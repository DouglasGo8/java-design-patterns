package com.udemy.java.design.patterns.solid.dependency.inversion;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MessagePrinter {

    public void writerMessage(Message msg, Formatter formatter, PrintWriter writer) {
        // final Formatter formatter = new JSONFormatter();
        writer.println(formatter.format(msg));
        writer.flush();

    }
}
