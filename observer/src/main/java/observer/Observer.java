package observer;

/**
 * The Observer interface defines the update method that all followers must implement.
 * This way, the Subject can talk to any follower without knowing their specific class.
 */
public interface Observer {
    void update(String news);
}
