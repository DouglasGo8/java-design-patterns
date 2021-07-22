package com.udemy.java.design.patterns.main.patterns.behavioral.chainofresp;

public class Director extends LoanApproval {
  @Override
  void approveLoan(Loan loan) {
    if (loan.getAmount() <= 25_000L) {
      System.out.println("Approved by Director");
    } else {
      super.next.approveLoan(loan);
    }
  }
}
