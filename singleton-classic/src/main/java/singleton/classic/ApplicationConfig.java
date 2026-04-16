package singleton.classic;

import java.util.HashMap;
import java.util.Map;

/**
 * Classic Singleton implementation with a simple key-value store.
 * The 'synchronized' keyword ensures thread-safety.
 */
public class ApplicationConfig {

    private static ApplicationConfig instance;
    private Map<String, Object> settings;

    // Private constructor ensures no one can create an instance with 'new'
    private ApplicationConfig() {
        System.out.println("Loading Config (Classic)!");
        settings = new HashMap<>();
    }

    /**
     * Lazy initialization: the instance is created only when requested.
     */
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