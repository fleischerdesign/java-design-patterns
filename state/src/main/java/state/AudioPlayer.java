package state;

/**
 * The Context class.
 * It maintains a reference to the current state and delegates all actions to it.
 */
public class AudioPlayer {
    private State state;

    public AudioPlayer() {
        // Initial state
        this.state = new PausedState();
    }

    /**
     * Allows states to transition to a new state.
     */
    public void setState(State state) {
        this.state = state;
    }

    // These methods delegate the call to the current state object
    public void clickPlay() { state.play(this); }
    public void clickPause() { state.pause(this); }
    public void clickLock() { state.lock(this); }
}
