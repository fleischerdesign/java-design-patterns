package state;

/**
 * Common interface for all states.
 * Each method represents an action that the context can trigger.
 */
public interface State {
    void play(AudioPlayer player);
    void pause(AudioPlayer player);
    void lock(AudioPlayer player);
}
