package mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * The concrete Mediator.
 * It keeps track of all users and manages the message distribution.
 */
public class ChatRoom implements ChatMediator {
    private List<User> users = new ArrayList<>();

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String msg, User user) {
        for (User u : this.users) {
            // Relaying the message to everyone except the sender
            if (u != user) {
                u.receive(msg);
            }
        }
    }
}
