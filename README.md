# Design Principles

In design principles, there are 2 types that we will be discussing:
1. **GRASP principles**
2. **SOLID principles**

## GRASP Principles

Creating a maintainable, scalable, and reusable software system is at the core of successful software development. To achieve this, design principles are essential.

GRASP stands for General Responsibility Assignment Software Patterns - 9 best practices:

1. Creator
2. Information Expert
3. Low Coupling
4. High Cohesion
5. Controller
6. Polymorphism
7. Pure Fabrication
8. Indirection
9. Protected Variation

### 1. Creator

The creator principle involves assigning the responsibility of creating an object to a class that needs to use an object and has the necessary information to create it or aggregate the object. This principle ensures a clear separation of concerns and simplifies object creation.

### 2. Information Expert

The Information Expert principle states that responsibility should be assigned to the class with the most knowledge required to fulfill the responsibility. It promotes encapsulation.

### 3. Low Coupling

Low coupling involves minimizing dependencies between classes to reduce the impact of changes and improve maintainability and modularity.

### 4. High Cohesion

High cohesion means grouping related responsibilities together within a single class to make it easier to understand, maintain, and reuse. This principle ensures that each class has a single, focused purpose.

### 5. Controller

The controller principle assigns the responsibility of handling system events to a dedicated class, which manages and coordinates the system's behaviors. This principle helps maintain a clean separation between the presentation and domain layers.

### 6. Polymorphism

It involves using inheritance and interfaces to enable different classes to implement the same behavior or operation. This principle allows for more flexibility and easier code maintenance.

### 7. Pure Fabrication

It involves creating an artificial class to fulfill a specific responsibility when no suitable class exists.

### 8. Indirection

It introduces an intermediate class or object to mediate between other classes, helping to maintain low coupling.

### 9. Protected Variations

It involves encapsulating variations and changes in the system behind stable interfaces to minimize the impact of changes and increase the system's robustness.

## SOLID Principles

SOLID principle is the most widely used principle in the industry. Each letter in SOLID stands for a principle:

1. Single-responsibility
2. Open-closed
3. Liskov substitution
4. Interface segregation
5. Dependency inversion

### Single-Responsibility Principle

The single responsibility principle states that every class should perform a single functionality. Implementation of multiple functions in a single class makes it messy, and any modifications required may affect the whole class.

### Open-Closed Principle

The application of a module entails the methods, functions, variables, etc. The open-closed principle states that according to new requirements, the module should be open for extension but closed for modification. The extension allows us to implement new functionality to the module.

### Liskov Substitution Principle

The Liskov substitution principle was introduced by Barbara Liskov. It applies to inheritance in such a way that the derived classes must be completely substitutable for their base classes.

### Interface Segregation Principle

The principle states that the larger interfaces should be split into smaller ones because the implementation classes use only the methods that are required. We should not force the client to use the methods that they do not want to use.

### Dependency Inversion Principle

The principle states that we must use abstraction instead of concrete implementations. High-level modules should not depend on the low-level module but both should depend on the abstraction.
