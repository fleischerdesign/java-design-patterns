# Abstract Factory Pattern
Think of the Abstract Factory as a 'Factory of Factories'. It is used to create families of related objects (like a set of Windows buttons and checkboxes, or a set of Mac buttons and checkboxes) without specifying their concrete classes. It ensures that all created objects are compatible with each other (e.g., you don't mix Windows buttons with Mac checkboxes).

## Class Diagram

```mermaid
classDiagram
    direction TB
    class Application {
        -Button button
        -Checkbox checkbox
        +Application(GUIFactory factory)
        +paint()
    }
    class Button {
        <<interface>>
        +paint()
    }
    class Checkbox {
        <<interface>>
        +paint()
    }
    class GUIFactory {
        <<interface>>
        +createButton() Button
        +createCheckbox() Checkbox
    }
    class MacButton {
        +paint()
    }
    class MacCheckbox {
        +paint()
    }
    class MacFactory {
        +createButton() Button
        +createCheckbox() Checkbox
    }
    class WindowsButton {
        +paint()
    }
    class WindowsCheckbox {
        +paint()
    }
    class WindowsFactory {
        +createButton() Button
        +createCheckbox() Checkbox
    }
    class Main {
        +main(args: String[])
    }

    Button <|.. MacButton
    Button <|.. WindowsButton
    Checkbox <|.. MacCheckbox
    Checkbox <|.. WindowsCheckbox
    GUIFactory <|.. MacFactory
    GUIFactory <|.. WindowsFactory
    MacFactory ..> MacButton : creates
    MacFactory ..> MacCheckbox : creates
    WindowsFactory ..> WindowsButton : creates
    WindowsFactory ..> WindowsCheckbox : creates
    Application --> Button
    Application --> Checkbox
    Application ..> GUIFactory
    Main ..> GUIFactory
    Main ..> Application
```
