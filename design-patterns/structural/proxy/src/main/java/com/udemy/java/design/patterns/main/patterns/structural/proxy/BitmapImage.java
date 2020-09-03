package com.udemy.java.design.patterns.main.patterns.structural.proxy;

import javafx.geometry.Point2D;

public class BitmapImage implements Image {

    private final String name;

    private Point2D location;

    public BitmapImage(String name) {
        System.out.println("Loaded from disk:" + name);
        this.name = name;
    }

    @Override
    public void render() {
        System.out.println("Rendered " + this.name);
    }

    @Override
    public Point2D getLocation() {
        return this.location;
    }

    @Override
    public void setLocation(Point2D point2D) {
        this.location = point2D;
    }
}
