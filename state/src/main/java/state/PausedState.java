package state;

/**
 * Concrete state: the player is currently paused.
 */
public class PausedState implements State {
    @Override
    public void play(AudioPlayer player) {
        System.out.println("Resuming audio...");
        player.setState(new PlayingState());
    }
    @Override
    public void pause(AudioPlayer player) {
        System.out.println("Already paused. Do nothing.");
    }
    @Override
    public void lock(AudioPlayer player) {
        System.out.println("Locking player while paused...");
        player.setState(new LockedState());
    }
}
