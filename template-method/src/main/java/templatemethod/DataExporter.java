package templatemethod;

/**
 * The Abstract Class defining the template method.
 */
public abstract class DataExporter {
    
    /**
     * The Template Method.
     * It is 'final' to prevent subclasses from changing the order of steps.
     */
    public final void export() {
        openFile();
        extractData();
        convertData(); // This is the flexible step
        closeFile();
        System.out.println("Export completed.\n");
    }

    private void openFile() {
        System.out.println("Opening destination file...");
    }

    private void extractData() {
        System.out.println("Extracting data from database...");
    }

    private void closeFile() {
        System.out.println("Closing file and saving changes.");
    }

    /**
     * Subclasses must implement this specific step.
     */
    protected abstract void convertData();
}
