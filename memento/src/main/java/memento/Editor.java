package memento;

/**
 * The Originator.
 * This class creates a memento of itself and can restore its state from a memento.
 */
public class Editor {
    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    /**
     * Creates a snapshot of the current state.
     */
    public EditorMemento save() {
        return new EditorMemento(content);
    }

    /**
     * Restores the state from a previously saved snapshot.
     */
    public void restore(EditorMemento memento) {
        if (memento != null) {
            this.content = memento.getContent();
        }
    }
}
