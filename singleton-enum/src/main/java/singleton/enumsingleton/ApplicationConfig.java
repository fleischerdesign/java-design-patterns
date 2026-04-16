package singleton.enumsingleton;

import java.util.HashMap;
import java.util.Map;

/**
 * Enum Singleton implementation.
 * This is the safest way to implement a Singleton in Java.
 * Java handles the instantiation and thread safety.
 */
public enum ApplicationConfig {

    INSTANCE;

    private Map<String, Object> settings;

    // Enums can have constructors, which are called only once
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