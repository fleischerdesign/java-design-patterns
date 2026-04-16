package strategy;

/**
 * Concrete strategy for road-based navigation.
 */
public class RoadStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String a, String b) {
        System.out.println("Road route from " + a + " to " + b + " calculated.");
    }
}
