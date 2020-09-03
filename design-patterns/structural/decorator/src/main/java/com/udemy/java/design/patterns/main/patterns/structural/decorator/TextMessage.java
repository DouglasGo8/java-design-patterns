package com.udemy.java.design.patterns.main.patterns.structural.decorator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TextMessage implements Message {

    private final String msg;

    @Override
    public String getContent() {
        return this.msg;
    }


}
