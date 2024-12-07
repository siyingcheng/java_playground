# Java Playground

In this branch, I will learn Java Design Patterns.

## Design Patterns
 
3 Groups of Design Patterns:

1. `Creational Patterns`: provide more flexibility in how the objects are actually created.
2. `Structural Patterns`: deal with how inheritance and composition can be used to provide extra functionality.
3. `Behavioral Patterns`: are about communication and assignment of responsibilities between our objects. 

### Creational Patterns

`SINGLETON` let you access your object from **anywhere** in your application. Guarantees that only **one instance** of this class
will be available at any point in time.

`FACTORY METHOD PATTERN` is used to create objects without specifying the exact class of object that will be created.

`ABSTRACT FACTORY` is a factory pattern that provides an interface for creating families of related objects without

`BUILDER` is a creational pattern that allows you to create complex objects step by step.

`PROTOTYPE` is a creational pattern that creates new objects by copying existing objects.

### Structural Patterns

`BRIDGE` is a structural pattern that decouples an abstraction from its implementation so that the two can vary independently.

### Behavioral Patterns

`CHAIN OF RESPONSIBILITY` is a behavioral pattern that allows multiple objects to handle a request, each object
handles the request by either handling it itself or passing it on to the next object in the chain.

`COMMAND` is a behavioral pattern that encapsulates a request as an object, thereby allowing for the parameterization of

`TEMPLATE METHOD` is a behavioral pattern that defines the skeleton of an algorithm in a base class, but lets subclasses

`MEDIATOR` is a behavioral pattern that defines an object that encapsulates how a set of objects interact.

`MEMENTO` is a behavioral pattern that provides the ability to restore an object to its previous state.

`OBSERVER` is a behavioral pattern that allows multiple objects to be notified of changes in a subject.

`STATE` is a behavioral pattern that allows an object to change its behavior when its internal state changes.

`STRATEGY` is a behavioral pattern that enables an algorithm's behavior to be selected at runtime.

`ITERATOR` is a behavioral pattern that provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

`VISITOR` is a behavioral pattern that separates an algorithm from an object structure on which it operates.

`ADAPTER` is a behavioral pattern that allows two incompatible interfaces to work together.

### Principles

`SOLID` principles are a set of design principles that aim to make software designs more understandable, flexible, and maintainable.

1. Single Responsibility Principle (SRP): A class should have only one reason to change.
2. Open/Closed Principle (OCP): Software entities should be open for extension but closed for modification.
3. Liskov Substitution Principle (LSP): Subtypes must be substitutable for their base types
4. Interface Segregation Principle (ISP): Make fine-grained interfaces that are client-specific.
5. Dependency Inversion Principle (DIP): Depend on abstractions, not on concretions.
