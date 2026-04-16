package composite;

/**
 * Common interface for both Files and Directories.
 * This allows the client to treat them uniformly.
 */
public interface FileSystemComponent {
    void showDetails();
}
