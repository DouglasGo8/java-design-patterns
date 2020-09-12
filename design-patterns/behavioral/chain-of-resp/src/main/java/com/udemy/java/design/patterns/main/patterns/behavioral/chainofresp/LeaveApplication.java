package com.udemy.java.design.patterns.main.patterns.behavioral.chainofresp;

import lombok.Getter;

import java.time.LocalDate;

public class LeaveApplication {

    public enum Type {Sick, PTO, LOP}

    public enum Status {Pending, Approved, Rejected}

    @Getter
    private Type type;
    @Getter
    private Status status;

    private LocalDate to;
    private LocalDate from;

    private String processedBy;

    public LeaveApplication(Type type, LocalDate from, LocalDate to) {
        this.to = to;
        this.from = from;
        this.type = type;
        this.status = Status.Pending;

    }

    public void approve(String role) {
        System.out.println(role);
    }

}
