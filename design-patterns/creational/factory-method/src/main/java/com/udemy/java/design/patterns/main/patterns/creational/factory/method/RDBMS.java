package com.udemy.java.design.patterns.main.patterns.creational.factory.method;

public class RDBMS implements Database {
  @Override
  public String connect() {
    return "Connection Successfully with RDBMS";
  }
}
