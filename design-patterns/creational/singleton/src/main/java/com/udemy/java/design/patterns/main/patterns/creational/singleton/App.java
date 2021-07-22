package com.udemy.java.design.patterns.main.patterns.creational.singleton;


import static java.lang.System.out;

public class App {

    public static void main(String... args) {

        var eager1 = EagerRegistry.getInstance();
        var eager2 = EagerRegistry.getInstance();

        out.println(eager1);
        out.println(eager2);


        var threadOne = new Thread(() -> out.println("1." + LazyRegistryWithDCL.getInstance()));
        var threadTwo = new Thread(() -> out.println("2." + LazyRegistryWithDCL.getInstance()));


        threadOne.start();
        threadTwo.start();

        LazyRegistryIODH singleton;

        // Constructor will be invoked just only once
        singleton = LazyRegistryIODH.getInstance(); // Lazy
        // singleton = LazyRegistryIODH.getInstance(); // Lazy

        // Better approach
        var inst = LazyRegistryWithDCL.getInstance();

    }
}
