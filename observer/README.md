# Observer Pattern
This pattern is like a subscription service. A central object (the Subject) keeps a list of followers (Observers) and automatically pings them whenever something changes. It is great for decoupling: the Subject does not need to know the details of its followers, it just knows they want updates.

## Class Diagram

```mermaid
classDiagram
    direction TB
    class Observer {
        <<interface>>
        +update(news: String) void
    }
    class Subject {
        <<interface>>
        +attach(observer: Observer) void
        +detach(observer: Observer) void
        +notifyObservers(news: String) void
    }
    class NewsAgency {
        -observers: List~Observer~
        +attach(observer: Observer) void
        +detach(observer: Observer) void
        +notifyObservers(news: String) void
        +setNews(news: String) void
    }
    class NewsChannel {
        -name: String
        +update(news: String) void
    }
    
    Subject <|.. NewsAgency
    Observer <|.. NewsChannel
    NewsAgency o-- Observer
    Subject ..> Observer
```
