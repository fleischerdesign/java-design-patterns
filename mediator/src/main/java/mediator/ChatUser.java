package mediator;

/**
 * A concrete User in our chat system.
 */
public class ChatUser extends User {
    public ChatUser(ChatMediator med, String name) {
        super(med, name);
    }

    @Override
    public void send(String msg) {
        System.out.println(this.name + " sends: " + msg);
        // We talk to the mediator, not to other users directly
        mediator.sendMessage(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name + " receives: " + msg);
    }
}
