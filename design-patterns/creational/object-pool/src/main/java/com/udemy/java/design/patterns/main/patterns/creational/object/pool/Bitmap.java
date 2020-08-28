package com.udemy.java.design.patterns.main.patterns.creational.object.pool;

import javafx.geometry.Point2D;

public class Bitmap implements Image {

    private final String name;

    private Point2D location;

    public Bitmap(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("Drawing " + this.name + " @ " + this.location);
    }

    @Override
    public Point2D getLocation() {
        return this.location;
    }

    @Override
    public void setLocation(Point2D location) {
        this.location = location;
    }

    @Override
    public void reset() {
        this.location = null;
        System.out.println("Bitmap is reset!");
    }
}
