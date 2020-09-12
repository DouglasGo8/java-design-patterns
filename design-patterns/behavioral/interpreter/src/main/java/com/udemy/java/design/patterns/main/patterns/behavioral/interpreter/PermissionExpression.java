package com.udemy.java.design.patterns.main.patterns.behavioral.interpreter;

public interface PermissionExpression {
    boolean interpret(User user);
}
