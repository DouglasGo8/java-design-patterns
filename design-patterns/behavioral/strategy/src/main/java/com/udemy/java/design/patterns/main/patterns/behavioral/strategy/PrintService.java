package com.udemy.java.design.patterns.main.patterns.behavioral.strategy;

import lombok.AllArgsConstructor;

import java.util.LinkedList;

@AllArgsConstructor
public class PrintService {

    private final OrderPrinter printer;

    public void printOrders(LinkedList<Order> orders) {
        this.printer.print(orders);
    }
}
