package com.udemy.java.design.patterns.main.patterns.behavioral.template.method;

import lombok.Getter;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Order {

    @Getter
    private String id;

    @Getter
    private  Double total;

    @Getter
    private LocalDate date;

    @Getter
    private Map<String, Double> items = new HashMap<>();

    public Order(String id) {
        this.id = id;
        date = LocalDate.now();
    }
}
