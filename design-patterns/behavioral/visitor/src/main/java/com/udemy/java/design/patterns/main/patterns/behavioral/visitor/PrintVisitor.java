package com.udemy.java.design.patterns.main.patterns.behavioral.visitor;

public class PrintVisitor implements Visitor {

    @Override
    public void visit(Manager manager) {

    }

    @Override
    public void visit(Programmer programmer) {
        var msg = programmer.getName() + " is a " + programmer.getSkill() + " programmer";
        System.out.println(msg);
    }

    @Override
    public void visit(ProjectLead projectLead) {
        var msg = projectLead.getName() + " is Project Lead with " + projectLead.getDirectReports().size() +
                " programmers reporting";
        System.out.println(msg);
    }
}
