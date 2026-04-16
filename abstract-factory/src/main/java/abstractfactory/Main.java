package abstractfactory;

/**
 * Main class to demonstrate the Abstract Factory.
 * It detects the OS and chooses the correct factory.
 */
public class Main {
    public static void main(String[] args) {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();

        // Choosing the right factory based on the OS
        if (osName.contains("mac")) {
            factory = new MacFactory();
        } else {
            factory = new WindowsFactory();
        }
        
        // The application doesn't care which factory it gets
        app = new Application(factory);
        app.paint();
    }
}
