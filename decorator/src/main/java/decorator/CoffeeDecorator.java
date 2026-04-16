package decorator;

/**
 * The base Decorator class.
 * It implements the same interface as the component it wraps.
 */
public abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee; // The object being decorated

    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    // Default behavior is to delegate to the wrapped object
    public double getCost() {
        return decoratedCoffee.getCost();
    }

    public String getDescription() {
        return decoratedCoffee.getDescription();
    }
}
