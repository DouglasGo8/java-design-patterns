package com.udemy.java.design.patterns.solid.intf.segregation.handson;

public class OrderPersistenceService implements PersistentService<Order> {
    @Override
    public void save(Order entity) {

    }


    @Override
    public void someUserMethod() { // violates interface segregation
        throw new UnsupportedOperationException("No make sense this method in the interface");
    }
}
