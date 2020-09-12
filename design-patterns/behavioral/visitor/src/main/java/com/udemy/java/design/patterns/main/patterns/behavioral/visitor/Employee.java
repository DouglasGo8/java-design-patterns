package com.udemy.java.design.patterns.main.patterns.behavioral.visitor;

import java.util.Collection;

public interface Employee {
    int getEmployeeId();

    int getPerformanceRating();

    void setPerformanceRating(int rating);

    Collection<Employee> getDirectReports();

    void accept(Visitor visitor);

}
