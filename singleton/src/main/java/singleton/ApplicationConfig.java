package singleton;

import java.util.HashMap;
import java.util.Map;

public class ApplicationConfig {

	private static ApplicationConfig instance;
	private Map<String, String> settings;

	private ApplicationConfig() {
		System.out.println("Loading Config!");
		settings = new HashMap<>();
	}

	public static ApplicationConfig getInstance() {
		if (instance == null) {
			instance = new ApplicationConfig();
		}
		return instance;
	}

	public String get(String key) {
		return settings.get(key);
	}

	public void set(String key, String value) {
		settings.put(key, value);
	}
}
