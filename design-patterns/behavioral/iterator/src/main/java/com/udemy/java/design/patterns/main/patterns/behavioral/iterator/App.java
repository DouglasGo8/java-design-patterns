package com.udemy.java.design.patterns.main.patterns.behavioral.iterator;

public class App {

    public static void main(String... args) {

        var iterator = ThemeColor.getIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
