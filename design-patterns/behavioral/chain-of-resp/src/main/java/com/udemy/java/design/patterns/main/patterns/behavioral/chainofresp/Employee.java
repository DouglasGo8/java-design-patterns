package com.udemy.java.design.patterns.main.patterns.behavioral.chainofresp;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Employee implements LeaveApprover {

    private final String role;
    private final LeaveApprover successor;

    @Override
    public String getApproverRole() {
        return role;
    }

    @Override
    public void processLeaveApp(LeaveApplication leaveApp) {
        if (!processRequest(leaveApp) && successor != null) {
            successor.processLeaveApp(leaveApp);
        }
    }

    protected abstract boolean processRequest(LeaveApplication application);
}
