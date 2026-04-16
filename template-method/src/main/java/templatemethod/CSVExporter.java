package templatemethod;

/**
 * Concrete implementation of our data exporter for CSV format.
 */
public class CSVExporter extends DataExporter {
    @Override
    protected void convertData() {
        System.out.println("Converting data to CSV format (comma-separated)...");
    }
}
