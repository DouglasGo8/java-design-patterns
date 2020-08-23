package com.udemy.java.design.patterns.solid.open.closed.handson;

public class PhoneSubscriber extends Subscriber {

    /**
     * @apiNote - open for extension
     */
    @Override
    public double calculateBill() {
        
        System.out.println(super.getAddress());
        System.out.println(super.getSubscriberId());

        return 0.0d;
    }

    
}