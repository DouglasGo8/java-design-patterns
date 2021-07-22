package com.udemy.java.design.patterns.main.patterns.behavioral.chainofresp;

import lombok.Setter;

public abstract class LoanApproval {

  @Setter
  protected LoanApproval next;

  abstract void approveLoan(Loan loan);
}
