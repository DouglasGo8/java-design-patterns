package com.udemy.java.design.patterns.main.patterns.behavioral.chainofresp;

public interface LeaveApprover {

    void processLeaveApp(LeaveApplication leaveApp);

    String getApproverRole();
}
