# Flyweight Pattern
The Flyweight pattern is used for optimization. When you have a massive amount of similar objects (like 10,000 trees in a game), you don't want each object to store the same heavy data (like textures). Instead, you store the shared data once and each object just keeps a reference to it. This saves a lot of memory.

## Class Diagram

```mermaid
classDiagram
    direction TB
    class TreeType {
        -String name
        -String color
        -String otherTreeData
        +TreeType(String name, String color, String otherTreeData)
        +draw(int x, int y)
    }
    class Tree {
        -int x
        -int y
        -TreeType type
        +Tree(int x, int y, TreeType type)
        +draw()
    }
    class TreeFactory {
        -static Map<String, TreeType> treeTypes$
        +static getTreeType(String name, String color, String otherTreeData) TreeType$
    }
    class Main {
        +main(args: String[])
    }

    Tree --> TreeType
    TreeFactory ..> TreeType : manages/creates
    Main ..> TreeFactory
    Main ..> Tree
    Main ..> TreeType
```
