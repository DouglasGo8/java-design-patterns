package com.udemy.java.design.patterns.main.patterns.creational.factory.method;

public class JSONMessage extends Message {

    @Override
    String getContent() {
        return "{\"JSON\":[]}";
    }
}
