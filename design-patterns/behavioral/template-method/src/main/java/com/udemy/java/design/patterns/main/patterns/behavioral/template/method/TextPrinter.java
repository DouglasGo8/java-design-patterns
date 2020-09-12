package com.udemy.java.design.patterns.main.patterns.behavioral.template.method;

import java.util.stream.Stream;

public class TextPrinter extends OrderPrinter {

    @Override
    protected String end() {
        return null;
    }

    @Override
    protected String start() {
        return "Order Details";
    }

    @Override
    protected String formatTotal(Order order) {
        return null;
    }

    @Override
    protected String formatItems(Order order) {
        return null;
    }

    @Override
    protected String formatOrderNumber(Order order) {
        return "Order #" + order.getId();
    }
}
