package state;

/**
 * Concrete state: the player is currently playing music.
 */
public class PlayingState implements State {
    @Override
    public void play(AudioPlayer player) {
        System.out.println("Already playing. Do nothing.");
    }
    @Override
    public void pause(AudioPlayer player) {
        System.out.println("Pausing audio...");
        player.setState(new PausedState());
    }
    @Override
    public void lock(AudioPlayer player) {
        System.out.println("Locking player while playing...");
        player.setState(new LockedState());
    }
}
