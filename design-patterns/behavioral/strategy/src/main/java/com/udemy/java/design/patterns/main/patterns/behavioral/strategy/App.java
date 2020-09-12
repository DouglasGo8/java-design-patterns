package com.udemy.java.design.patterns.main.patterns.behavioral.strategy;

import java.util.LinkedList;

public class App {


    private static LinkedList<Order> orders = new LinkedList<>();

    public static void main(String... args) {

        createOrders();
        //
        var print = new SummaryPrinter();
        var service = new PrintService(print);
        //
        service.printOrders(orders);
        //
    }

    private static void createOrders() {
        //
        var order1 = new Order("100");
        //
        order1.addItem("Soda", 2d);
        order1.addItem("Chips", 10d);
        //
        orders.add(order1);

    }
}
