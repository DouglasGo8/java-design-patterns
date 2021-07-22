package com.udemy.java.design.patterns.main.patterns.behavioral.visitor;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CEO implements Visitor {

  @Getter
  private final String name;

  @Override
  public void visit(Visitable vis) {
    var emp = (Employee) vis;

    emp.setPerformanceStatus("Good");

    System.out.println("Ok performance done for emp ".concat(emp.getName()));
  }
}
