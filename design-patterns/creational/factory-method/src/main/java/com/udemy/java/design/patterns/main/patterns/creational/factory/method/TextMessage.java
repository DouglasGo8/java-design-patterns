package com.udemy.java.design.patterns.main.patterns.creational.factory.method;

public class TextMessage extends Message {
    @Override
    String getContent() {
        return "Text";
    }
}
