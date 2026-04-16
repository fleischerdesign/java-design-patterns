package memento;

import java.util.Stack;

/**
 * The Caretaker.
 * It is responsible for keeping the mementos but never modifies them.
 */
public class History {
    private Stack<EditorMemento> states = new Stack<>();

    public void push(EditorMemento state) {
        states.push(state);
    }

    public EditorMemento pop() {
        if (!states.isEmpty()) {
            return states.pop();
        }
        return null;
    }
}
