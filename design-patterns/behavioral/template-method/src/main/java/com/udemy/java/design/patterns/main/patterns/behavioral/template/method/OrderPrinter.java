package com.udemy.java.design.patterns.main.patterns.behavioral.template.method;

import lombok.SneakyThrows;

import java.io.PrintWriter;

public abstract class OrderPrinter {

    @SneakyThrows
    public final void printOrderMethod(Order order, String fileName) {

        try (var printer = new PrintWriter(fileName)) {
            printer.println(this.start());
            printer.println(formatOrderNumber(order));
            printer.println(formatItems(order));
            printer.println(formatTotal(order));
            printer.println(end());
        }
    }

    protected abstract String end();
    protected abstract String start();
    protected abstract String formatTotal(Order order);
    protected abstract String formatItems(Order order);
    protected abstract String formatOrderNumber(Order order);

}
