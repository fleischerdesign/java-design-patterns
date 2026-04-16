package singleton.billpugh;

import java.util.HashMap;
import java.util.Map;

/**
 * Bill Pugh Singleton implementation.
 * It uses a static inner class to hold the instance.
 * This approach is thread-safe and efficient without explicit synchronization.
 */
public class ApplicationConfig {

    /**
     * The helper class is only loaded by the JVM when getInstance() is called.
     * This ensures lazy loading and thread safety.
     */
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