package com.udemy.java.design.patterns.main.patterns.creational.simple.factory;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class NewsPost extends Post {
    private String news;
    private LocalDate postedOn;
}
