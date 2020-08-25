package com.udemy.java.design.patterns.main.patterns.creational.factory.method;

public class TextMessageCreator extends MessageCreator {
    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
