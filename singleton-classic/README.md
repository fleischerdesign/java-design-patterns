# Singleton Pattern (Classic)
This is the standard way to implement a Singleton. It uses a private constructor and a static method to provide a single point of access. It also uses lazy initialization, meaning the instance is only created when it is actually needed.

## Class Diagram

```mermaid
classDiagram
    direction TB
    class ApplicationConfig {
        -instance: ApplicationConfig$
        -settings: Map~String, Object~
        -ApplicationConfig()
        +getInstance()$ ApplicationConfig
        +get(key: String, type: Class~T~, defaultValue: T) T
        +set(key: String, value: T) void
    }
    
    ApplicationConfig --> ApplicationConfig
```
