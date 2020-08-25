package com.udemy.java.design.patterns.main.patterns.creational.factory.method;

public class App {

    public static void main(String... args) {

        var json = new JSONMessageCreator();
        var text = new TextMessageCreator();
        //
        printMessage(json);
        printMessage(text);
    }

    private static void printMessage(MessageCreator creator) {
        var message = creator.getMessage();
        System.out.println(message);
    }
}
