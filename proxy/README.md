# Proxy Pattern
The Proxy pattern acts as a placeholder or a 'gatekeeper' for another object. In this example, we use it for Lazy Loading: we show a 'cheap' thumbnail immediately and only load the 'expensive' high-resolution image when the user actually clicks on it. This saves time and memory.

## Class Diagram

```mermaid
classDiagram
    direction TB
    class Image {
        <<interface>>
        +display() void
    }
    class RealImage {
        -fileName: String
        +RealImage(fileName: String)
        -loadHeavyFile() void
        +display() void
    }
    class ProxyImage {
        -realImage: RealImage
        -fileName: String
        +ProxyImage(fileName: String)
        +display() void
    }
    
    Image <|.. RealImage
    Image <|.. ProxyImage
    ProxyImage --> RealImage
```
