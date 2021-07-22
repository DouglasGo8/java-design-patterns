package com.udemy.java.design.patterns.main.patterns.behavioral.state;

public class Developer implements EmployeeState {
  @Override
  public void work() {
    System.out.println("Working");
  }

  @Override
  public void canApproveLeave() {
    System.out.println("Yes, get it out!!");
  }
}
