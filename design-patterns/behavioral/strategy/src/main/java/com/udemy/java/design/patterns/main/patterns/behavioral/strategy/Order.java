package com.udemy.java.design.patterns.main.patterns.behavioral.strategy;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Order {

    @Getter
    @Setter

    private String id;
    @Getter
    @Setter
    private LocalDate date;

    @Getter
    private double total;

    @Getter
    private Map<String, Double> items = new HashMap<>();

    public Order(String id) {
        this.id = id;
        this.date = LocalDate.now();
    }


    public void addItem(String name, Double price) {
        this.items.put(name, price);
    }


}
