package mediator;

/**
 * Demonstrating the Mediator pattern.
 * Users talk to each other through the ChatRoom, not directly.
 */
public class Main {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatRoom();

        User user1 = new ChatUser(mediator, "Alice");
        User user2 = new ChatUser(mediator, "Bob");
        User user3 = new ChatUser(mediator, "Charlie");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        // Alice sends a message, everyone else receives it
        user1.send("Hi everyone!");
        System.out.println("---");
        user2.send("Hello Alice!");
    }
}
