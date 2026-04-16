package templatemethod;

/**
 * Concrete implementation of our data exporter for JSON format.
 */
public class JSONExporter extends DataExporter {
    @Override
    protected void convertData() {
        System.out.println("Converting data to JSON format (brackets and keys)...");
    }
}
