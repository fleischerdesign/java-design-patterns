package singleton.classic;

import java.util.HashMap;
import java.util.Map;

public class ApplicationConfig {

	private static ApplicationConfig instance;
	private Map<String, Object> settings;

	private ApplicationConfig() {
		System.out.println("Loading Config (Classic)!");
		settings = new HashMap<>();
	}

	public static synchronized ApplicationConfig getInstance() {
		if (instance == null) {
			instance = new ApplicationConfig();
		}
		return instance;
	}

	public <T> T get(String key, Class<T> type, T defaultValue) {
		Object value = settings.get(key);
		if (value != null && type.isInstance(value)) {
			return type.cast(value);
		}
		return defaultValue;
	}

	public <T> void set(String key, T value) {
		settings.put(key, value);
	}
}