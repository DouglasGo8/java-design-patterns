package com.udemy.java.design.patterns.main.patterns.creational.prototype;

import javafx.geometry.Point3D;
import lombok.SneakyThrows;

public class App {


    @SneakyThrows
    public static void main(String... args) {

        var swordsman = new Swordsman();

        swordsman.move(new Point3D(-10, 0, 0), 20);
        swordsman.attack();

        System.out.println(swordsman);

        //

        var s1 = (Swordsman) swordsman.clone();

        System.out.println(s1);


    }
}
