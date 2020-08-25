package com.udemy.java.design.patterns.main.patterns.creational.factory.method;

public abstract class MessageCreator {

    public Message getMessage() {
        var message = this.createMessage();
        //
        message.addDefaultHeaders();
        message.encrypt();

        return message;
    }

    public abstract Message createMessage();

}
