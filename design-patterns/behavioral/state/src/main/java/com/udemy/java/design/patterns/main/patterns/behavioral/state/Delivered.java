package com.udemy.java.design.patterns.main.patterns.behavioral.state;

public class Delivered implements OrderState {

    @Override
    public double handleCancellation() {
        System.out.println("Contacting courier");
        System.out.println("Payment rollback will be initiated");

        return 30;
    }
}
