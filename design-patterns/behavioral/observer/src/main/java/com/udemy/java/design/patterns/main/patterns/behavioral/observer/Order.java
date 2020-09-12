package com.udemy.java.design.patterns.main.patterns.behavioral.observer;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private String id;

    @Getter
    private double itemCost;

    @Getter
    private int count;

    @Setter
    private double discount;
    @Setter
    private double shippingCost;

    private final List<OrderObserver> observers = new ArrayList<>();


    public Order(String id) {
        this.id = id;
    }

    public void attach(OrderObserver observer) {
        this.observers.add(observer);
    }

    public void detach(OrderObserver observer) {
        this.observers.remove(observer);
    }

    public void addItem(double price) {
        itemCost += price;
        count++;
        observers.forEach(observer -> observer.updated(this));
    }

    public double getTotal() {
        return this.itemCost - discount + shippingCost;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", itemCost=" + itemCost +
                ", count=" + count +
                ", discount=" + discount +
                ", shippingCost=" + shippingCost +
                '}';
    }
}
