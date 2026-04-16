# Visitor Pattern
The Visitor pattern allows you to add new operations to an existing object structure without modifying the objects themselves. It separates the algorithm from the object structure. Think of it as an 'External Specialist' (the Visitor) who visits different rooms in a house (the Objects). The rooms stay the same, but different visitors can perform different tasks in them (one cleans, one inspects, one evaluates).

## Class Diagram

```mermaid
classDiagram
    class ComputerPart {
        <<interface>>
        +accept(ComputerPartVisitor visitor) void
    }

    class ComputerPartVisitor {
        <<interface>>
        +visit(Computer computer) void
        +visit(Mouse mouse) void
        +visit(Keyboard keyboard) void
        +visit(Monitor monitor) void
    }

    class Keyboard {
        +accept(ComputerPartVisitor visitor) void
    }

    class Monitor {
        +accept(ComputerPartVisitor visitor) void
    }

    class Mouse {
        +accept(ComputerPartVisitor visitor) void
    }

    class Computer {
        ~ComputerPart[] parts
        +Computer()
        +accept(ComputerPartVisitor visitor) void
    }

    class ComputerPartDisplayVisitor {
        +visit(Computer computer) void
        +visit(Mouse mouse) void
        +visit(Keyboard keyboard) void
        +visit(Monitor monitor) void
    }

    ComputerPart <|.. Keyboard
    ComputerPart <|.. Monitor
    ComputerPart <|.. Mouse
    ComputerPart <|.. Computer
    ComputerPartVisitor <|.. ComputerPartDisplayVisitor
    Computer o-- ComputerPart
    ComputerPart ..> ComputerPartVisitor
    ComputerPartVisitor ..> Computer
    ComputerPartVisitor ..> Mouse
    ComputerPartVisitor ..> Keyboard
    ComputerPartVisitor ..> Monitor
```
