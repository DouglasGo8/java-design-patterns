package com.udemy.java.design.patterns.main.patterns.creational.factory.method;

public class App {

  public static void main(String... args) {

    var rdbms = DataBaseFactory.getDataBase("RDBMS");

    System.out.println("Database : " + rdbms.getClass().getSimpleName());
    System.out.println(rdbms.connect());
  }


}
