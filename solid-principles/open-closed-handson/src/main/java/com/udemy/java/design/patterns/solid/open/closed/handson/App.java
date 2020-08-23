package com.udemy.java.design.patterns.solid.open.closed.handson;

public class App {


    public static void main(String... args) {
        
        var subscriber = new PhoneSubscriber();
        
        subscriber.setSubscriberId(11L);
        subscriber.setAddress("address One");
        //
        subscriber.calculateBill();

    }
    
}