package com.udemy.java.design.patterns.main.patterns.behavioral.interpreter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class NorExpression implements PermissionExpression {

    private final PermissionExpression expression;

    @Override
    public boolean interpret(User user) {
        return !expression.interpret(user);
    }


    @Override
    public String toString() {
        return "NOT " + expression;
    }
}
