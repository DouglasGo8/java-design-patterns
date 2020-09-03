package com.udemy.java.design.patterns.main.patterns.structural.decorator;

public class App {

    public static void main(String... args) {

        var msg = new TextMessage("The <FORCE> is strong with this one!");
        var html = new HtmlEncodeMessage(msg);

        System.out.println(msg.getContent());
        System.out.println(html.getContent());

    }
}
