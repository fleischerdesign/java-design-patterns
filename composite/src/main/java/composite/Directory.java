package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * The Composite class.
 * It contains a list of FileSystemComponents (which can be Files or other Directories).
 */
public class Directory implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> components = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    public void removeComponent(FileSystemComponent component) {
        components.remove(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Directory: " + name);
        // Delegating the call to all child components recursively
        for (FileSystemComponent component : components) {
            component.showDetails();
        }
    }
}
