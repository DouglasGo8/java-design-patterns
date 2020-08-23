package com.udemy.java.design.patterns.solid.intf.segregation.handson;

public interface PersistentService<T> {
    void save(T entity);

    void someUserMethod();
}
