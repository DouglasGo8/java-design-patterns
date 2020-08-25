package com.udemy.java.design.patterns.main.patterns.creational.simple.factory;

/**
 * @author dbatista
 */
public class PostFactory {

    public static Post createPost(final String type) {
        //
        switch (type) {
            case "blog":
                return new BlogPost();
            case "news":
                return new NewsPost();
            case "product":
                return new ProductPost();
            default:
                throw new IllegalArgumentException();
        }
    }
}
