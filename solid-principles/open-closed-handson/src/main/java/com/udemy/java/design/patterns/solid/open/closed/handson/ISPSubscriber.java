package com.udemy.java.design.patterns.solid.open.closed.handson;

public class ISPSubscriber extends Subscriber {

    @Override
    public double calculateBill() {
        System.out.println(super.getAddress());
        return 0.0d;
    }


}