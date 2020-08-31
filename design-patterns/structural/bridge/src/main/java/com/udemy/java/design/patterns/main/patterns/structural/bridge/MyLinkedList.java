package com.udemy.java.design.patterns.main.patterns.structural.bridge;

public interface MyLinkedList<T> {

    void addFirst(T element);

    T removeFirst();

    void addLast(T element);

    T removeLast();

    int getSize();
}
