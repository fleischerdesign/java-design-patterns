package strategy;

/**
 * The Context class that uses a RouteStrategy.
 * It uses a fluent interface to set start, destination, and strategy.
 */
public class Navigator {
    private RouteStrategy strategy;
    private String start;
    private String destination;

    public Navigator() {
        // Default strategy
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
            System.out.println("No start point defined!");
        } else if (this.destination == null) {
            System.out.println("No destination defined!");
        } else {
            // Delegating the work to the current strategy
            strategy.buildRoute(this.start, this.destination);
        }
    }
}
