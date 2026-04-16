package adapter;

/**
 * The Translator class.
 * It implements the standard interface but talks to the 'fancy' new player in the background.
 */
public class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType) {
        // Choosing the right modern player to adapt
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMusicPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        // Translating the standard 'play' call to the specific modern method
        if (advancedMusicPlayer != null) {
            if (audioType.equalsIgnoreCase("vlc")) {
                advancedMusicPlayer.playVlc(fileName);
            } else if (audioType.equalsIgnoreCase("mp4")) {
                advancedMusicPlayer.playMp4(fileName);
            }
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
