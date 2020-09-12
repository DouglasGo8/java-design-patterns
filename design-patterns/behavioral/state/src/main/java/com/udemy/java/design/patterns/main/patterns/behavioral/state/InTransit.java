package com.udemy.java.design.patterns.main.patterns.behavioral.state;

public class InTransit implements OrderState {

    @Override
    public double handleCancellation() {
        System.out.println("Contacting courier");
        System.out.println("Contacting payment gateway");
        return 20;
    }

}
