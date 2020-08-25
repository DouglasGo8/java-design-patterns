package com.udemy.java.design.patterns.main.patterns.creational.simple.factory;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BlogPost extends Post {

    private String author;
    private String[] tags;
}
