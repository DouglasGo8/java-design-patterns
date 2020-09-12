package com.udemy.java.design.patterns.main.patterns.behavioral.interpreter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AndExpression implements PermissionExpression {

    private final PermissionExpression expression1;
    private final PermissionExpression expression2;

    @Override
    public boolean interpret(User user) {
        return expression1.interpret(user) && expression2.interpret(user);
    }

    @Override
    public String toString() {
        return expression1 + " AND " + expression2;
    }
}
