package com.udemy.java.design.patterns.main.patterns.behavioral.state;

public class Employee {

  private String designation;
  private EmployeeState employeeState;

  public Employee(String designation) {
    this.setDesignation(designation);
  }

  void working() {
    employeeState.work();
  }

  void auth() {
    employeeState.canApproveLeave();
  }

  void setDesignation(String designation) {
    this.designation = designation;
    switch (designation) {
      case "HR":
        employeeState = new HumanResources();
        break;
      case "Developer":
        employeeState = new Developer();
        break;
      default:
        throw new UnsupportedOperationException("Diiieee Fullll");
    }
  }
}
