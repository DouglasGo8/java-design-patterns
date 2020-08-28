package com.udemy.java.design.patterns.main.patterns.creational.object.pool;

import javafx.geometry.Point2D;

public class App {

    public static void main(String... args) {

        var obj = new ObjectPool<>(() -> new Bitmap("Logo.bmp"), 5);

        var bitmap1  = obj.get();
        bitmap1.setLocation(new Point2D(10, 10));

        System.out.println(bitmap1);

        var bitmap2 = obj.get();
        bitmap2.setLocation(new Point2D(-10, 0));

        System.out.println(bitmap2);

        bitmap1.draw();
        bitmap2.draw();

        obj.release(bitmap1);
        obj.release(bitmap2);

        System.out.println(bitmap1);
        bitmap1.setLocation(new Point2D(20, 10));
        bitmap1.draw();
    }
}
