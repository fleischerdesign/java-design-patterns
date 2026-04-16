# Facade Pattern
The Facade pattern provides a simplified interface to a complex subsystem. Instead of making the client talk to 10 different classes to get a job done, the client talks to one 'Facade' class that handles all the complicated interactions in the background. It's like a universal remote for your home theater.

## Class Diagram

```mermaid
classDiagram
    direction TB
    class Amplifier {
        +on()
        +setVolume(int level)
        +off()
    }
    class DvdPlayer {
        +on()
        +play(String movie)
        +stop()
        +off()
    }
    class Projector {
        +on()
        +wideScreenMode()
        +off()
    }
    class TheaterLights {
        +dim(int level)
        +on()
    }
    class HomeTheaterFacade {
        -Amplifier amp
        -DvdPlayer dvd
        -Projector projector
        -TheaterLights lights
        +HomeTheaterFacade(Amplifier amp, DvdPlayer dvd, Projector projector, TheaterLights lights)
        +watchMovie(String movie)
        +endMovie()
    }
    class Main {
        +main(args: String[])
    }

    HomeTheaterFacade --> Amplifier
    HomeTheaterFacade --> DvdPlayer
    HomeTheaterFacade --> Projector
    HomeTheaterFacade --> TheaterLights
    Main ..> HomeTheaterFacade
    Main ..> Amplifier
    Main ..> DvdPlayer
    Main ..> Projector
    Main ..> TheaterLights
```
