package state;

/**
 * Concrete state: the player is locked and ignores play/pause actions.
 */
public class LockedState implements State {
    @Override
    public void play(AudioPlayer player) {
        System.out.println("Player is locked! Unlock it first.");
    }
    @Override
    public void pause(AudioPlayer player) {
        System.out.println("Player is locked! Unlock it first.");
    }
    @Override
    public void lock(AudioPlayer player) {
        System.out.println("Unlocking player...");
        player.setState(new PausedState());
    }
}
