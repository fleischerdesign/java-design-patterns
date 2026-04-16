# Factory Pattern
The Factory pattern is all about hiding the complexity of object creation. Instead of the client using 'new' to create specific objects, it asks a Factory to do it. This makes the code more flexible because we can add new types of objects without changing the client code.

## Class Diagram

```mermaid
classDiagram
    direction TB
    class Shape {
        <<interface>>
        +draw()
    }
    class Circle {
        +draw()
    }
    class Square {
        +draw()
    }
    class ShapeFactory {
        +getShape(String shapeType) Shape
    }
    class Main {
        +main(args: String[])
    }

    Shape <|.. Circle
    Shape <|.. Square
    ShapeFactory ..> Circle : creates
    ShapeFactory ..> Square : creates
    Main ..> ShapeFactory
    Main ..> Shape
```
