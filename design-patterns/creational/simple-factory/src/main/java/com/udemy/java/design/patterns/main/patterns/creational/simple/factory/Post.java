package com.udemy.java.design.patterns.main.patterns.creational.simple.factory;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * @author dbatista
 */
@Getter
@Setter
public abstract class Post {

    private Long id;
    private String title;
    private String content;

    private LocalDateTime createdOn;
    private LocalDateTime publishedOn;
}
