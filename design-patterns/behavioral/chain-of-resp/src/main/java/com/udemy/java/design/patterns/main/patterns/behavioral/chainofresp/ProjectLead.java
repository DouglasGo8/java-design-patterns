package com.udemy.java.design.patterns.main.patterns.behavioral.chainofresp;

public class ProjectLead extends Employee {

    public ProjectLead(LeaveApprover successor) {
        super("Project Lead", successor);
    }

    @Override
    protected boolean processRequest(LeaveApplication application) {
        if (application.getType() == LeaveApplication.Type.Sick) {
            application.approve(super.getApproverRole());
            return true;
        }
        return false;
    }
}
