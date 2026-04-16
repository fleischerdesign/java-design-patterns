package decorator;

/**
 * Demonstrating the Decorator pattern.
 * Notice how we stack decorators on top of each other.
 */
public class Main {
    public static void main(String[] args) {
        // Start with a basic coffee
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " costs " + coffee.getCost());

        // Decorate it with milk
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " costs " + coffee.getCost());

        // Decorate it again with sugar
        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " costs " + coffee.getCost());
        
        // We can even add milk twice!
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " costs " + coffee.getCost());
    }
}
