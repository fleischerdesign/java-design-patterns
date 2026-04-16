package command;

/**
 * The Command interface.
 * It defines the execute method and an undo method to reverse the action.
 */
public interface Command {
    void execute();
    void undo();
}
