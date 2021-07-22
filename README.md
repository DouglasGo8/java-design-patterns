# Java Design Patterns and SOLID Principles

---

## SOLID actually is a acronomy that means

1. Single Responsibility Principle
    * There should never be more than one reason for a class to change.
    * Must be focused, single functionality and address a specific concern.
    * Should avoid change your class, to adapt its self to changes about protocols, message format or stuffs like that.
    * If we have 1 or more responsibilities we must have a specific class for this.

2. Open closed Principle
    * Open for extension, but closed for modification, that means extend existing behavior and existing code remains
      unchanged.

3. Liskov Substitution Principle
    * Should be to substitute base classes objects with child class object and not alter behavior/characteristics of
      program.

4. Interface Segregation Principle
    * Clients should not be forced to depend upon interfaces that they do not using, to avoid interface pollution.

5. Dependency Inversion Principle
    * High level modules should not depend upon low level modules, both should depend upon abstractions.
    * Abstractions should not depend upon details, details should depend upon abstraction.

### Design Patterns

1. Creational
    * deal with the process of creation objects of classes, they are:

        * Builder
          > The Class constructor requires a lot of inf in an immutable scenario.
          > Objects that needs other objects or "parts" to construct them

        * Simple Factory
          > Multiple types can be instantiated, and the choice based on some simple criteria

        * Factory Method
          > We want to move the object creation logic from our code to a separate class

        * Prototype
      > **Prototype** is a creational design pattern that allows cloning objects, even complex ones, without coupling to their specific classes.

        * Singleton
      > When we need just only one instance, accessible globally through a single point

        * Abstract Factory
      > Is used when we have two or more objects which work together forming a kit or set and there can be multiple sets or kits that can be created by client code

        * Object Pool
      > Cost of creating an instance of a class is high, and we have many objects, but its is the most complicated pattern to implement, a thread-safe caching of objects should be done in pool

2. Structural
    * deal with how classes and objects are arranged or composed

    * Adapter
      > When we have an existing object which providers the functionality that client needs, but the client code can't use this object cause it expects an object with different interface

    * Bridge
      > We can decouple them, so they can both change without affecting each other

    * Decorator
      > We want to enhance behavior of our existing object dynamically as and when required then we can use decorator

    * Composite
      > We have a part-whole relationship or hierarchy of objects, and we want to be able to treat all objects in this hierarchy uniformly

    * Facade
      > Client has to interact with many interfaces and classes in a subsystem to get result, this results in a tightly coupled with those interfaces & classes

    * Flyweight
      > Our system needs many number of objects of a particular class & maintaining these instances is a performance concern

    * Proxy
      > We need provide a placeholder or surrogate to another project.

3. Behavioral
    * describe how classes and objects interacts & communicate with each other.

    * Chain of Responsibility
      > We have a hierarchical objects with spec responsibilities greater than the prev

    * Command
      > Object is used to encapsulate all info such method name, object that owns the method and values for method parameter which is needed to perform an action

    * Interpreter
      > We use an interpreter when we want to process a simple "language" with rules or grammar.

    * Mediator
      > Encapsulates how a set of objects interact with each other. Due to this encapsulation there is a loose coupling between interacting objects.

    * Iterator
      > Iterator allows a way to access elements/children of an aggregate object in sequence while hiding the actual internal data structure used.

    * Memento
      > When we want to store object's state without exposing internal details about the state

    * Observer
      > We can notify multiple objects whenever an object changes state

    * State
      > Allow our objects to behave differently based on its current internal state

    * Strategy
      > Allow us to encapsulate an algorithm in a class, can configure our context or main object with an object of this class

    * Template Method
      > We define an algorithm in a method as a series of steps

    * Visitor
      > Allow us to define new operations that can be performed on an object without changed the class definition

    * Null Object
      > We use "null" value to represent an absence of object, Using "Null Object" patter we can provide an alternate representation to indicate an absence of object 