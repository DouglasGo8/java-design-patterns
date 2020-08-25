package com.udemy.java.design.patterns.main.patterns.creational.factory.method;

public class JSONMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
