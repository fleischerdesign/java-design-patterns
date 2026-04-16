# Command Pattern
The Command pattern turns a request into a stand-alone object. This object contains all the information needed to perform the action. This is powerful because it allows us to queue requests, pass them as arguments, and most importantly, it makes implementing 'Undo' very easy by storing the reverse action in the same object.

## Class Diagram

```mermaid
classDiagram
    direction TB
    class Command {
        <<interface>>
        +execute()
        +undo()
    }
    class Light {
        -String name
        +Light(name: String)
        +on()
        +off()
    }
    class LightOnCommand {
        -Light light
        +LightOnCommand(light: Light)
        +execute()
        +undo()
    }
    class LightOffCommand {
        -Light light
        +LightOffCommand(light: Light)
        +execute()
        +undo()
    }
    class RemoteControl {
        -Stack~Command~ history
        +pressButton(command: Command)
        +pressUndo()
    }
    class Main {
        +main(args: String[])
    }

    Command <|.. LightOnCommand
    Command <|.. LightOffCommand
    LightOnCommand o-- Light
    LightOffCommand o-- Light
    RemoteControl o-- Command
    Main ..> RemoteControl
    Main ..> Light
    Main ..> Command
```
