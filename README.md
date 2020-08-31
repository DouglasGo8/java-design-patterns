
# Java Design Patterns and SOLID Principles

---

## SOLID actually is a acronomy that means

1. Single Responsibility Principle
   * There should never be more than one reason for a class to change.
   * Must be focused, single functionality and address a specific concern.
   * Should avoid change your class, to adapt its self to changes about protocols, message format or stuffs like that.
   * If we have 1 or more responsibilities we must have a specific class for this.

2. Open closed Principle
   * Open for extension, but closed for modification, that means extend existing behavior and existing code remains unchanged.

3. Liskov Substitution Principle
   * Should be to substitute base classes objects with child class object and not alter behavior/characteristics of program.

4. Interface Segregation Principle
   * Clients should not be forced to depend upon interfaces that they do not using, to avoid interface pollution.

5. Dependency Inversion Principle
   * High level modules should not depend upon low level modules, both should depend upon abstractions.
   * Abstractions should not depend upon details, details should depend upon abstraction.

### Design Patterns

1. Creational
   * deal with the process of creation objects of classes, they are:

      * Builder
         > When Class constructor requires a lot of inf in an immutable scenario.
         > Objects that needs other objects or "parts" to construct them

      * Simple Factory
        > Multiple types can be instantiated, and the choice based on some simple criteria
        
      * Factory Method
        > When we want to move the object creation logic from our code to a separate class 

      * Prototype
       > We have a complex and costly object to create, to create more instances of such class, Object.clone
 
      * Singleton
       > When we need just only one instance, accessible globally through a single point 

      * Abstract Factory
       > Is used when we have two or more objects which work together forming a kit or set and there
         can be multiple sets or kits that can be created by client code

      * Object Pool
       > Cost of creating an instance of a class is high, and we have many objects, but its is the most complicated
         pattern to implement, a thread-safe caching of objects should be done in pool
2. Structural
   * deal with how classes and objects are arranged or composed
   
    * Adapter
       > When we have an existing object which providers the functionality that client needs, but the client code can't
         use this object cause it expects an object with different interface
       
    * Bridge
       > We can decouple them, so they can both change without affecting each other
    * Decorator
    
    * Composite
    
    * Facade
    
    * Flyweight
    
    * Proxy
    
3. Behavioral
   * describe how classes and objects interacts & communicate with each other.
