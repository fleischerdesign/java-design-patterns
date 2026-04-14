package singleton.enumsingleton;

import java.util.HashMap;
import java.util.Map;

public enum ApplicationConfig {

	INSTANCE;

	private Map<String, Object> settings;

	ApplicationConfig() {
		System.out.println("Loading Config (Enum)!");
		settings = new HashMap<>();
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