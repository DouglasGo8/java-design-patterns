package com.udemy.java.design.patterns.main.patterns.behavioral.visitor;

public interface Visitor {

    void visit(Manager manager);

    void visit(Programmer programmer);

    void visit(ProjectLead projectLead);


}
