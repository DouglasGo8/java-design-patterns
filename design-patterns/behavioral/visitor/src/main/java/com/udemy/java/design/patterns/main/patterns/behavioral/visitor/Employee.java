package com.udemy.java.design.patterns.main.patterns.behavioral.visitor;

import lombok.Getter;
import lombok.Setter;

public class Employee implements Visitable {

  @Getter
  private final String name;

  @Getter
  @Setter
  private String performanceStatus;

  public Employee(String name) {
    this.name = name;
  }

  @Override
  public void accept(Visitor v) {
    v.visit(this);
  }
}
