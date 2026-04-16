# Iterator Pattern
The Iterator pattern provides a standard way to loop through a collection of objects (like a list or a tree) without exposing how that collection is stored internally. Whether the data is in an array or a linked list, the client always uses 'hasNext' and 'next' to go through it.

## Class Diagram

```mermaid
classDiagram
    direction TB
    class Iterator {
        <<interface>>
        +hasNext() boolean
        +next() Object
    }
    class Container {
        <<interface>>
        +getIterator() Iterator
    }
    class NameRepository {
        +String[] names
        +getIterator() Iterator
    }
    class NameIterator {
        ~int index
        +hasNext() boolean
        +next() Object
    }
    class Main {
        +main(args: String[])
    }

    Container <|.. NameRepository
    Iterator <|.. NameIterator
    NameRepository +-- NameIterator
    NameRepository ..> NameIterator : creates
    Main ..> Container
    Main ..> Iterator
    Main ..> NameRepository
```
