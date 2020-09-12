package com.udemy.java.design.patterns.main.patterns.behavioral.observer;

public class App {

    public static void main(String... args) {

        var order = new Order("100");
        var price = new PriceObserver();
        //
        order.attach(price);
        order.addItem(50);
        order.addItem(179);
        //
        System.out.println(order);

    }
}
