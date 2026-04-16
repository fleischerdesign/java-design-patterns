# Mediator Pattern
The Mediator pattern is like an Air Traffic Control tower. Instead of every pilot talking to every other pilot (which would be chaos), everyone talks only to the tower. The tower coordinates everything. This reduces the dependencies between objects and makes the system much easier to maintain.

## Class Diagram

```mermaid
classDiagram
    direction TB
    class ChatMediator {
        <<interface>>
        +sendMessage(String msg, User user)
        +addUser(User user)
    }
    class ChatRoom {
        -List<User> users
        +addUser(User user)
        +sendMessage(String msg, User user)
    }
    class User {
        <<abstract>>
        #ChatMediator mediator
        #String name
        +User(ChatMediator med, String name)
        +send(String msg)*
        +receive(String msg)*
    }
    class ChatUser {
        +ChatUser(ChatMediator med, String name)
        +send(String msg)
        +receive(String msg)
    }
    class Main {
        +main(args: String[])
    }

    ChatMediator <|.. ChatRoom
    User <|-- ChatUser
    ChatRoom --> User : manages
    User --> ChatMediator : communicates via
    Main ..> ChatMediator
    Main ..> ChatRoom
    Main ..> User
    Main ..> ChatUser
```
