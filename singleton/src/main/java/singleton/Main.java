package singleton;

class Main {
	public static void main(String[] args) {
		ApplicationConfig config = ApplicationConfig.getInstance();
		config.set("theme", "dark");
		System.out.println(config.get("theme"));
	}
}
