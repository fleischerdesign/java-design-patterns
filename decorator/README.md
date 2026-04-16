# Decorator Pattern
The Decorator pattern is like adding toppings to a pizza or ingredients to a coffee. You start with a base object and wrap it in 'Decorators' that add new functionality. Each decorator has the same interface as the object it wraps, so you can stack them like layers of an onion.

## Class Diagram

```mermaid
classDiagram
    direction TB
    class Coffee {
        <<interface>>
        +getCost() double
        +getDescription() String
    }
    class SimpleCoffee {
        +getCost() double
        +getDescription() String
    }
    class CoffeeDecorator {
        <<abstract>>
        #Coffee decoratedCoffee
        +CoffeeDecorator(coffee: Coffee)
        +getCost() double
        +getDescription() String
    }
    class MilkDecorator {
        +MilkDecorator(coffee: Coffee)
        +getCost() double
        +getDescription() String
    }
    class SugarDecorator {
        +SugarDecorator(coffee: Coffee)
        +getCost() double
        +getDescription() String
    }
    class Main {
        +main(args: String[])
    }

    Coffee <|.. SimpleCoffee
    Coffee <|.. CoffeeDecorator
    CoffeeDecorator <|-- MilkDecorator
    CoffeeDecorator <|-- SugarDecorator
    CoffeeDecorator o-- Coffee : decorates
    Main ..> Coffee
    Main ..> SimpleCoffee
```
