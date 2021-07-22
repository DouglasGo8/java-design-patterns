package com.udemy.java.design.patterns.main.patterns.creational.prototype;

import lombok.SneakyThrows;

import java.util.ArrayList;

public class App {


  @SneakyThrows
  public static void main(String... args) {


    var shapes = new ArrayList<Shape>();
    var shapesCopy = new ArrayList<Shape>();


    var circle = new Circle();
    circle.setX(10);
    circle.setY(20);
    circle.setRadius(15);
    circle.setColor("red");

    var circle2 = circle.clone();

    // Diff
    if (circle == circle2) {
      System.out.println("You got the same inst");
    } else {
      System.out.println("You got the diff inst");
    }

    // Equals

    if (circle.equals(circle2)) {
      System.out.println("You got the same inst");
    } else {
      System.out.println("You got the diff inst");
    }


  }
}
