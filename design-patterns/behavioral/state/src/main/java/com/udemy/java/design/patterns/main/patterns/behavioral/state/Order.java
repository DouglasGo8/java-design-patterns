package com.udemy.java.design.patterns.main.patterns.behavioral.state;

public class Order {



    private OrderState currentState;

    public Order() {
        currentState = new New();
    }

    public double cancel() {
        currentState = new Cancelled();
        return this.currentState.handleCancellation();

    }

    public void paymentSuccessfully() {
        currentState = new Paid();
    }

    public void dispatched() {
        currentState = new InTransit();
    }

    public void delivered() {
        currentState = new Delivered();
    }

}
