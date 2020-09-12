package com.udemy.java.design.patterns.main.patterns.behavioral.visitor;

import lombok.Getter;

public class Programmer extends AbstractEmployee {

    @Getter
    private final String skill;

    public Programmer(String name, String skill) {
        super(name);
        this.skill = skill;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
