# Bridge Pattern
The Bridge pattern is about separating a big class into two hierarchies: the 'Abstraction' (what it is, e.g., a Shape) and the 'Implementation' (how it's done, e.g., Vector vs Raster rendering). This avoids a 'class explosion' where you'd have to create a class for every combination of shape and renderer.

## Class Diagram

```mermaid
classDiagram
    direction TB
    class Renderer {
        <<interface>>
        +render(shapeData: String)
    }
    class VectorRenderer {
        +render(shapeData: String)
    }
    class RasterRenderer {
        +render(shapeData: String)
    }
    class Shape {
        <<abstract>>
        #Renderer renderer
        +Shape(renderer: Renderer)
        +draw()*
    }
    class Circle {
        -float radius
        +Circle(renderer: Renderer, radius: float)
        +draw()
    }
    class Square {
        -float side
        +Square(renderer: Renderer, side: float)
        +draw()
    }
    class Main {
        +main(args: String[])
    }

    Renderer <|.. VectorRenderer
    Renderer <|.. RasterRenderer
    Shape <|-- Circle
    Shape <|-- Square
    Shape o-- Renderer : bridge
    Main ..> Renderer
    Main ..> Shape
```
