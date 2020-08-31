package com.udemy.java.design.patterns.main.patterns.structural.adapter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EmployeeObjectAdapter implements Customer {

    private final Employee adaptee;

    @Override
    public String getName() {
        return this.adaptee.getFullName();
    }

    @Override
    public String getAddress() {
        return this.adaptee.getOfficeLocation();
    }

    @Override
    public String getDesignation() {
        return this.adaptee.getJobTitle();
    }
}
