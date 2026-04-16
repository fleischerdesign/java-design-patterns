package strategy;

/**
 * Concrete strategy for public transport navigation.
 */
public class PublicTransportStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String a, String b) {
        System.out.println("Public transport route from " + a + " to " + b + " calculated.");
    }
}
