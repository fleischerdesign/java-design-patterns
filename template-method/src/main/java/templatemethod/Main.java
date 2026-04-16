package templatemethod;

/**
 * Demonstrating the Template Method pattern.
 * The core export process is reused for both CSV and JSON formats.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Starting CSV Export ---");
        DataExporter csvExporter = new CSVExporter();
        csvExporter.export();

        System.out.println("--- Starting JSON Export ---");
        DataExporter jsonExporter = new JSONExporter();
        jsonExporter.export();
    }
}
