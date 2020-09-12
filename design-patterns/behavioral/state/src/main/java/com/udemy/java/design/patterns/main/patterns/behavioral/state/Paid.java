package com.udemy.java.design.patterns.main.patterns.behavioral.state;

public class Paid implements OrderState {

    @Override
    public double handleCancellation() {
        System.out.println("Contacting payment gateway to rollback transaction");
        return 10;
    }
}
