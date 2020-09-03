package com.udemy.java.design.patterns.main.patterns.structural.proxy;

import javafx.geometry.Point2D;

public class ImageProxy implements Image {

    private String name;
    private BitmapImage image;
    private Point2D location;

    public ImageProxy(String name) {
        this.name = name;
    }

    @Override
    public void render() {
        throw new UnsupportedOperationException("Dirty impl");
    }

    @Override
    public Point2D getLocation() {
        if (null != image) {
            return image.getLocation();
        }
        return this.location;
    }

    @Override
    public void setLocation(Point2D point2D) {

        if (null != image) {
            image.setLocation(point2D);
        } else {
            this.location = point2D;
        }

    }
}
