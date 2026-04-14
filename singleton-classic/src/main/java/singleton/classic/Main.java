package singleton.classic;

public class Main {
	public static void main(String[] args) {
		ApplicationConfig config = ApplicationConfig.getInstance();

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