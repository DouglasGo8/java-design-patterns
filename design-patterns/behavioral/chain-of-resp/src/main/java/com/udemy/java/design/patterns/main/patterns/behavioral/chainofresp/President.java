package com.udemy.java.design.patterns.main.patterns.behavioral.chainofresp;

public class President extends LoanApproval {

  @Override
  void approveLoan(Loan loan) {
    System.out.println("Approved by VP");
  }
}
