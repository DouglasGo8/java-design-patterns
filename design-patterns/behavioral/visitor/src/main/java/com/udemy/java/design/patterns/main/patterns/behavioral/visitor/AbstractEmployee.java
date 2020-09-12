package com.udemy.java.design.patterns.main.patterns.behavioral.visitor;

import lombok.Getter;

import java.util.Collection;

public abstract class AbstractEmployee implements Employee {

    @Getter
    private final String name;
    private final int employeeId;

    private int performanceRating;
    private static int employeeIdCounter = 101;


    public AbstractEmployee(String name) {
        this.name = name;
        employeeId = employeeIdCounter++;
    }

    @Override
    public int getPerformanceRating() {
        return this.performanceRating;
    }

    @Override
    public void setPerformanceRating(int performanceRating) {
        this.performanceRating = performanceRating;
    }

    @Override
    public int getEmployeeId() {
        return employeeId;
    }

    @Override
    public Collection<Employee> getDirectReports() {
        return null;
    }
}
