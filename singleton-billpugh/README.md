# Singleton Pattern (Bill Pugh)
The Bill Pugh Singleton uses a static inner helper class to create the instance. This is a very elegant way to achieve thread-safety without using 'synchronized'. The instance is only created when the 'getInstance' method is called, because the helper class is only loaded then.

## Class Diagram

```mermaid
classDiagram
    direction TB
    class ApplicationConfig {
        -settings: Map~String, Object~
        -ApplicationConfig()
        +getInstance()$ ApplicationConfig
        +get(key: String, type: Class~T~, defaultValue: T) T
        +set(key: String, value: T) void
    }
    class SingletonHolder {
        -INSTANCE: ApplicationConfig$
    }
    
    ApplicationConfig +-- SingletonHolder
    SingletonHolder --> ApplicationConfig
```
