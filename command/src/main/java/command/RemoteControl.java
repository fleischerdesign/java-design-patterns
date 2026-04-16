package command;

import java.util.Stack;

/**
 * The Invoker.
 * It knows how to trigger a command and keeps a history for undoing actions.
 */
public class RemoteControl {
    private Stack<Command> history = new Stack<>();

    public void pressButton(Command command) {
        command.execute();
        history.push(command);
    }

    /**
     * Reverses the last action by popping it from the history stack.
     */
    public void pressUndo() {
        if (!history.isEmpty()) {
            Command command = history.pop();
            System.out.print("Undoing... ");
            command.undo();
        } else {
            System.out.println("Nothing to undo.");
        }
    }
}
