package strategy;

public class Navigator {
	private RouteStrategy strategy;
	private String start;
	private String destination;

	public Navigator() {
		this.strategy = new RoadStrategy();
	}

	public Navigator from(String start) {
		this.start = start;
		return this;
	}

	public Navigator to(String destination) {
		this.destination = destination;
		return this;
	}

	public Navigator using(RouteStrategy strategy) {
		this.strategy = strategy;
		return this;
	}

	public void build() {
		if (this.start == null) {
			System.out.println("Kein Startpunkt festgelegt!");
		} else if (this.destination == null) {
			System.out.println("Kein Ziel festgelegt!");
		} else {
			strategy.buildRoute(this.start, this.destination);
		}
	}
}
