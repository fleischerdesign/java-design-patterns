# Chain of Responsibility Pattern
This pattern decouples the sender of a request from its receivers by giving multiple objects a chance to handle the request. Each handler in the chain either processes the request or passes it to the next link. It's like a corporate approval process where a TeamLead can approve small amounts, but expensive requests must go up to the CEO.

## Class Diagram

```mermaid
classDiagram
    direction TB
    class Approver {
        <<abstract>>
        #Approver nextApprover
        +setNextApprover(nextApprover: Approver)
        +approveRequest(amount: double)*
    }
    class CEO {
        +approveRequest(amount: double)
    }
    class TeamLead {
        +approveRequest(amount: double)
    }
    class Main {
        +main(args: String[])
    }

    Approver <|-- CEO
    Approver <|-- TeamLead
    Approver o-- Approver : next
    Main ..> Approver
```
