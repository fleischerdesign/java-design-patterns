# Memento Pattern
The Memento pattern is used to restore an object to a previous state. Think of it as a 'Save Game' or 'Snapshot' feature. It captures the internal state of an object without breaking its encapsulation, stores it safely outside, and allows you to roll back whenever you want.

## Class Diagram

```mermaid
classDiagram
    direction TB
    class Editor {
        -String content
        +setContent(String content)
        +getContent() String
        +save() EditorMemento
        +restore(EditorMemento memento)
    }
    class EditorMemento {
        -String content
        +EditorMemento(String content)
        +getContent() String
    }
    class History {
        -Stack<EditorMemento> states
        +push(EditorMemento state)
        +pop() EditorMemento
    }
    class Main {
        +main(args: String[])
    }

    Editor ..> EditorMemento : creates/restores from
    History o-- EditorMemento : stores
    Main ..> Editor
    Main ..> History
    Main ..> EditorMemento
```
