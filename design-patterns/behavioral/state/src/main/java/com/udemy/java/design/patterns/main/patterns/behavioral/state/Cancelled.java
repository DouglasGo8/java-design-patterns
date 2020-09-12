package com.udemy.java.design.patterns.main.patterns.behavioral.state;

public class Cancelled implements OrderState {

    @Override
    public double handleCancellation() {
       throw new IllegalArgumentException("Canceled order. Can't process it");
    }
}
