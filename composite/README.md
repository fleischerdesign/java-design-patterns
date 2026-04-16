# Composite Pattern
The Composite pattern is used to represent tree structures. It allows you to treat individual objects (Leaves) and groups of objects (Composites) the same way. A classic example is a file system where a folder can contain files or even other folders, but you can call 'showDetails' on both.

## Class Diagram

```mermaid
classDiagram
    direction TB
    class FileSystemComponent {
        <<interface>>
        +showDetails()
    }
    class File {
        -String name
        +File(name: String)
        +showDetails()
    }
    class Directory {
        -String name
        -List~FileSystemComponent~ components
        +Directory(name: String)
        +addComponent(component: FileSystemComponent)
        +removeComponent(component: FileSystemComponent)
        +showDetails()
    }
    class Main {
        +main(args: String[])
    }

    FileSystemComponent <|.. File
    FileSystemComponent <|.. Directory
    Directory o-- FileSystemComponent : children
    Main ..> FileSystemComponent
    Main ..> File
    Main ..> Directory
```
