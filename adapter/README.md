# Adapter Pattern
The Adapter pattern works exactly like a travel plug. If you have an object with an interface that doesn't fit into your system, you don't rewrite the object. Instead, you build an 'Adapter' that acts as a translator between the incompatible interface and the standard your system expects.

## Class Diagram

```mermaid
classDiagram
    direction TB
    class MediaPlayer {
        <<interface>>
        +play(audioType: String, fileName: String)
    }
    class AudioPlayer {
        +play(audioType: String, fileName: String)
    }
    class MediaAdapter {
        -AdvancedMediaPlayer advancedMusicPlayer
        +MediaAdapter(audioType: String)
        +play(audioType: String, fileName: String)
    }
    class AdvancedMediaPlayer {
        <<interface>>
        +playVlc(fileName: String)
        +playMp4(fileName: String)
    }
    class VlcPlayer {
        +playVlc(fileName: String)
        +playMp4(fileName: String)
    }
    class Mp4Player {
        +playVlc(fileName: String)
        +playMp4(fileName: String)
    }
    class Main {
        +main(args: String[])
    }

    MediaPlayer <|.. AudioPlayer
    MediaPlayer <|.. MediaAdapter
    AdvancedMediaPlayer <|.. VlcPlayer
    AdvancedMediaPlayer <|.. Mp4Player
    MediaAdapter o-- AdvancedMediaPlayer
    AudioPlayer ..> MediaAdapter
    Main ..> AudioPlayer
```
