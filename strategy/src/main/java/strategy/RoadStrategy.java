package strategy;

public class RoadStrategy implements RouteStrategy {
	public void buildRoute(String a, String b) {
		System.out.println("Autoroute von " + a + " nach " + b + " wurde berechnet.");
	}
}
