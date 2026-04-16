package singleton.enumsingleton;

/**
 * Demonstrating the Enum Singleton.
 * We access the instance directly via the Enum constant INSTANCE.
 */
public class Main {
    public static void main(String[] args) {
        // No getInstance() needed here
        ApplicationConfig config = ApplicationConfig.INSTANCE;

        config.set("theme", "dark");
        config.set("port", 8080);
        config.set("debug", true);

        String theme = config.get("theme", String.class, "light");
        int port = config.get("port", Integer.class, 80);
        boolean debug = config.get("debug", Boolean.class, false);

        System.out.println("Theme: " + theme);
        System.out.println("Port: " + port);
        System.out.println("Debug: " + debug);
    }
}