package com.udemy.java.design.patterns.main.patterns.behavioral.state;

public class App {

    public static void main(String... args) {

        var order = new Order();

        order.paymentSuccessfully();
        order.dispatched();
        order.cancel();
    }
}
