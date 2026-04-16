# Java Design Patterns Collection

This is my personal collection of common design patterns implemented in Java. I built this during my FIAE training to get a better grip on software architecture and clean code. 

Design patterns are like blueprints for solving recurring problems in coding. Instead of reinventing the wheel every time, we can use these established solutions to make our code more flexible, maintainable, and readable.

## Project Structure

Each pattern is located in its own Gradle module. You can run any pattern using the following command:

`./gradlew :module-name:run` (Replace `module-name` with the folder name, for example `:observer`)

## Categories

### Creational Patterns
These focus on how objects are created.
* **Singleton:** Ensuring a class has only one instance.
* **Factory / Abstract Factory:** Creating objects without specifying the exact class.
* **Builder:** Constructing complex objects step by step.
* **Prototype:** Creating new objects by cloning existing ones.

### Structural Patterns
These deal with how classes and objects are composed to form larger structures.
* **Adapter:** Making incompatible interfaces work together.
* **Bridge:** Separating abstraction from implementation.
* **Decorator:** Adding functionality to objects dynamically.
* **Composite:** Treating individual objects and groups of objects uniformly.
* **Facade:** Providing a simplified interface to a complex system.
* **Flyweight:** Sharing data to save memory.
* **Proxy:** Controlling access to an object.

### Behavioral Patterns
These are about communication between objects and how they work together.
* **Strategy:** Switching algorithms at runtime.
* **Observer:** Notifying multiple objects about state changes.
* **Chain of Responsibility:** Passing a request along a chain of handlers.
* **Command:** Encapsulating a request as an object.
* **Iterator:** Accessing elements of a collection sequentially.
* **Mediator:** Centralizing communication between objects.
* **Memento:** Capturing and restoring an object's state.
* **State:** Changing behavior based on internal state.
* **Template Method:** Defining the skeleton of an algorithm.
* **Visitor:** Adding new operations to a structure without changing it.

I hope this helps you as much as it helped me during my studies. Happy coding!
