package memento;

/**
 * Demonstrating the Memento pattern.
 * We can roll back the editor to previous versions using our history.
 */
public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();

        System.out.println("--- Editing text ---");
        editor.setContent("Version 1");
        System.out.println("Editor content: " + editor.getContent());
        history.push(editor.save()); // Save V1

        editor.setContent("Version 2");
        System.out.println("Editor content: " + editor.getContent());
        history.push(editor.save()); // Save V2

        editor.setContent("Version 3 (Final?)");
        System.out.println("Editor content: " + editor.getContent());

        System.out.println("\n--- Restoring state ---");
        // Revert to V2
        editor.restore(history.pop());
        System.out.println("Restored to: " + editor.getContent());

        // Revert to V1
        editor.restore(history.pop());
        System.out.println("Restored to: " + editor.getContent());
    }
}
