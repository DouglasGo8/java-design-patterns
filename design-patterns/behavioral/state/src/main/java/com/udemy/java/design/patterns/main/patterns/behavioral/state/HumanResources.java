package com.udemy.java.design.patterns.main.patterns.behavioral.state;

public class HumanResources implements EmployeeState{

  @Override
  public void work() {
    System.out.println("Recruitment resources");
  }

  @Override
  public void canApproveLeave() {
    System.out.println("HR Not approve");
  }
}
