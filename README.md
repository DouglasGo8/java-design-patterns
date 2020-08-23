
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
   * Should be to substitute base classe objects with child class object and not alter behavior/characteristics of program.

4. Interface Segregation Principle
   * Clients should not be forced to depend upon interfaces that they do not using, to avoid interface pollution.

5. Dependency Inversion Principle
   * high level modules should not depend upon low level modules, both should depend upon abstractions.
   * abstractions should not depend upon details, details should depend upon abstraction.

### Design Patterns

1. Creational
   * deal with the process of creation objects of classes, they are:

      * Builder
         > When Class constructor requires a lot of inf in immutable scenario.

         > Objects that needs other objects or "parts" to construct them

      * Simple Factory
      * Factory Method
      * Prototype
      * Singleton
      * Abstract Factory
      * Object Pool
2. Structural
   * deal with how classes and objects are arranged or composed
3. Behavioral
   * describe how classes and objects interacts & communicate with each other.
