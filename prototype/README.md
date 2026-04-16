# Prototype Pattern
The Prototype pattern is used when creating a new object from scratch is too expensive (like doing complex database queries). Instead, we take an existing object (the 'Prototype') and clone it. This is much faster and more efficient.

## Class Diagram

```mermaid
classDiagram
    direction TB
    class Shape {
        <<abstract>>
        -id: String
        #type: String
        ~draw()* void
        +getType() String
        +getId() String
        +setId(id: String) void
        +clone() Object
    }
    class Circle {
        +Circle()
        +draw() void
    }
    class Rectangle {
        +Rectangle()
        +draw() void
    }
    class ShapeCache {
        -shapeMap: Hashtable~String, Shape~
        +getShape(shapeId: String)$ Shape
        +loadCache()$ void
    }
    
    Shape <|-- Circle
    Shape <|-- Rectangle
    ShapeCache o-- Shape
```
