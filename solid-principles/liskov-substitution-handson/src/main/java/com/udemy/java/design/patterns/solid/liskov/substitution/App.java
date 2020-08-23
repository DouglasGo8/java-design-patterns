
package com.udemy.java.design.patterns.solid.liskov.substitution;


/**
 * @apiNote - Liskov Substitution
 */
public class App {

    public static void main(String... args) {

        var square = new Square(10);
        var rectangle = new Rectangle(10, 20);

        System.out.println(square.computeArea());
        System.out.println(rectangle.computeArea());
        //
        useRectangle(rectangle);
        //

    }

    private static void useRectangle(final Rectangle r) {

        r.setHeight(20);
        r.setWidth(30);

        assert r.getHeight() == 20 : "Height not equal to 20";
        assert r.getWidth() == 30 : "Width Not equal to 30";
    }

}