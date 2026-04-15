package strategy;

public class WalkingStrategy implements RouteStrategy {
	public void buildRoute(String a, String b) {
		System.out.println("Fußroute von " + a + " nach " + b + " wurde berechnet.");
	}
}
