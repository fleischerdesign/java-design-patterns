package singleton.classic;

/**
 * Demonstrating the classic Singleton usage.
 * We store and retrieve application settings from a single instance.
 */
public class Main {
    public static void main(String[] args) {
        // Accessing the single instance
        ApplicationConfig config = ApplicationConfig.getInstance();

        config.set("theme", "dark");
        config.set("port", 8080);
        config.set("debug", true);

        // Even if we called getInstance() again elsewhere, we would get the same data
        String theme = config.get("theme", String.class, "light");
        int port = config.get("port", Integer.class, 80);
        boolean debug = config.get("debug", Boolean.class, false);

        System.out.println("Theme: " + theme);
        System.out.println("Port: " + port);
        System.out.println("Debug: " + debug);
    }
}