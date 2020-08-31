package com.udemy.java.design.patterns.main.patterns.structural.bridge;

public interface MyFifoCollection<T> {

    // removes & return first element
    T poll();
    // Add element
    void offer(T element);
}
