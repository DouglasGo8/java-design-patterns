package com.udemy.java.design.patterns.solid.open.closed.handson;

import lombok.Getter;
import lombok.Setter;

/**
 * @apiNote - base class is now closed for modifications
 */
@Getter
@Setter
public abstract class Subscriber {
    
    private int baseRate;

    private long freeUsage;
    private long phoneNumber;
    private long subscriberId;

    private String address;


    abstract double calculateBill(); // allows extensions

}