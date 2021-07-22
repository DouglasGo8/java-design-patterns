package com.udemy.java.design.patterns.main.patterns.creational.factory.method;

public class DataBaseFactory {

  static Database getDataBase(String dbType) {

    Database dc = null;

    if ("RDBMS".equalsIgnoreCase(dbType)) {
      dc = new RDBMS();
    } else {
      dc = new DBMS();
    }
    return dc;
  }
}
