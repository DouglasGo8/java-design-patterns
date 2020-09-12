package com.udemy.java.design.patterns.main.patterns.behavioral.interpreter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Permission implements PermissionExpression {

    private final String permission;

    @Override
    public boolean interpret(User user) {
       return user.getPermissions().contains(permission);
    }

    @Override
    public String toString() {
        return this.permission;
    }
}
