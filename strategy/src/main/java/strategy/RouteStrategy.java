package strategy;

/**
 * Common interface for all route calculation algorithms.
 */
public interface RouteStrategy {
    void buildRoute(String start, String end);
}

