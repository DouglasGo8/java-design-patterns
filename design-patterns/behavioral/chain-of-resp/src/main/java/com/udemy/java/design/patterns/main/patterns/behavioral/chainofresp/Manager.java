package com.udemy.java.design.patterns.main.patterns.behavioral.chainofresp;

public class Manager extends LoanApproval {
  @Override
  void approveLoan(Loan loan) {
    if (loan.getAmount() <= 10_000L) {
      System.out.println("Approved by Manager");
    } else {
      super.next.approveLoan(loan);
    }
  }
}
