package com.udemy.java.design.patterns.main.patterns.creational.object.pool;

import lombok.SneakyThrows;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;

public class ObjectPool<T extends Poolable> {

    private final BlockingQueue<T> availablePool;

    public ObjectPool(Supplier<T> creator, int count) {
        this.availablePool = new LinkedBlockingQueue<>();
        for (int i = 0; i < count; i++) {
            availablePool.offer(creator.get());
        }
    }

    public T get() {
        try {
            return availablePool.take();
        } catch (InterruptedException e) {
            System.err.println("take() method fail");
        }
        return null;
    }

    @SneakyThrows
    public void release(T obj) {
        obj.reset();
        availablePool.put(obj);
    }
}
