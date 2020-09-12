package com.udemy.java.design.patterns.main.patterns.behavioral.interpreter;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public class User {

    @Getter
    private final String userName;
    private final List<String> permissions;

    public List<String> getPermissions() {
        return permissions.stream().map(String::toLowerCase).collect(Collectors.toList());
    }

}
