package singleton.billpugh;

import java.util.HashMap;
import java.util.Map;

public class ApplicationConfig {

	private static class SingletonHolder {
		private static final ApplicationConfig INSTANCE = new ApplicationConfig();
	}

	private Map<String, Object> settings;

	private ApplicationConfig() {
		System.out.println("Loading Config (Bill Pugh)!");
		settings = new HashMap<>();
	}

	public static ApplicationConfig getInstance() {
		return SingletonHolder.INSTANCE;
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