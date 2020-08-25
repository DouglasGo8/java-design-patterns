package com.udemy.java.design.patterns.main.patterns.creational.simple.factory;

public class App {

    public static void main(String... args) {

        var type = "news";
        var post = PostFactory.createPost(type);

        System.out.println(post);
    }
}
