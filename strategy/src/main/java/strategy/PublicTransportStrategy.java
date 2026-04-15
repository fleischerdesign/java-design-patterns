package strategy;

public class PublicTransportStrategy implements RouteStrategy {
	public void buildRoute(String a, String b) {
		System.out.println("Öffiroute von " + a + " nach " + b + " wurde berechnet.");
	}
}
