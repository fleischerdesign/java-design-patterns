# Builder Pattern
The Builder pattern is useful when we have a complex object with many optional parameters. Instead of a messy constructor with 10 arguments, we use a 'Builder' class to set the parameters one by one. This makes the code much more readable and avoids 'telescoping constructors'.

## Class Diagram

```mermaid
classDiagram
    direction TB
    class Computer {
        -String CPU
        -String RAM
        -String storage
        -boolean isGraphicsCardEnabled
        -boolean isBluetoothEnabled
        -Computer(builder: Builder)
        +toString() String
    }
    class Builder {
        -String CPU
        -String RAM
        -String storage
        -boolean isGraphicsCardEnabled
        -boolean isBluetoothEnabled
        +Builder(cpu: String, ram: String, storage: String)
        +setGraphicsCardEnabled(isEnabled: boolean) Builder
        +setBluetoothEnabled(isEnabled: boolean) Builder
        +build() Computer
    }
    class Main {
        +main(args: String[])
    }

    Computer +-- Builder
    Builder ..> Computer : creates
    Main ..> Builder
    Main ..> Computer
```
