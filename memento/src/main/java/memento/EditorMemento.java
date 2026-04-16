package memento;

/**
 * The Memento object.
 * It is an immutable object that stores a snapshot of the internal state.
 */
public class EditorMemento {
    private final String content;

    public EditorMemento(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
