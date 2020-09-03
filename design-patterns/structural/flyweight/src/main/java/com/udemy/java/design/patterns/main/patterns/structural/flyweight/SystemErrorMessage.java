package com.udemy.java.design.patterns.main.patterns.structural.flyweight;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SystemErrorMessage implements ErrorMessage {
    private final String helpUrlBase;
    private final String messageTemplate;

    @Override
    public String getText(String code) {
        return messageTemplate.replace("$errorCode", code).concat(helpUrlBase).concat(code);
    }
}
