# Strategy Pattern
This pattern allows us to swap algorithms at runtime. It defines a family of algorithms and makes them interchangeable. This is useful when we have different ways to do the same thing (like calculating a route) and we want to switch between them without changing the client code.

## Class Diagram

```mermaid
classDiagram
    class RouteStrategy {
        <<interface>>
        +buildRoute(String start, String end) void
    }

    class Navigator {
        -RouteStrategy strategy
        -String start
        -String destination
        +Navigator()
        +from(String start) Navigator
        +to(String destination) Navigator
        +using(RouteStrategy strategy) Navigator
        +build() void
    }

    class PublicTransportStrategy {
        +buildRoute(String start, String end) void
    }

    class RoadStrategy {
        +buildRoute(String start, String end) void
    }

    class WalkingStrategy {
        +buildRoute(String start, String end) void
    }

    RouteStrategy <|.. PublicTransportStrategy
    RouteStrategy <|.. RoadStrategy
    RouteStrategy <|.. WalkingStrategy
    Navigator o-- RouteStrategy
```
