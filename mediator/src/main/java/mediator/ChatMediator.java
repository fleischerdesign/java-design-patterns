package mediator;

/**
 * The Mediator interface.
 * It defines how objects should communicate with each other.
 */
public interface ChatMediator {
    void sendMessage(String msg, User user);
    void addUser(User user);
}
