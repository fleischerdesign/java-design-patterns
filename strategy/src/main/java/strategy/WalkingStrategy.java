package strategy;

/**
 * Concrete strategy for walking navigation.
 */
public class WalkingStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String a, String b) {
        System.out.println("Walking route from " + a + " to " + b + " calculated.");
    }
}
