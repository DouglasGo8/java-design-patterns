package com.udemy.java.design.patterns.main.patterns.creational.factory.method;

public abstract class Message {

    abstract String getContent();

    public void encrypt(){}
    public void addDefaultHeaders() {}

}
