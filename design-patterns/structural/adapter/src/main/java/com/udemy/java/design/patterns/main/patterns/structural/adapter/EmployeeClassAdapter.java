package com.udemy.java.design.patterns.main.patterns.structural.adapter;

/**
 * Avoid this concept
 */
public class EmployeeClassAdapter extends Employee implements Customer {

    @Override
    public String getName() {
        return super.getFullName();
    }

    @Override
    public String getAddress() {
        return super.getOfficeLocation();
    }

    @Override
    public String getDesignation() {
        return super.getJobTitle();
    }

}
