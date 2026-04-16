package prototype;

/**
 * Demonstrating the Prototype pattern.
 * Notice how we don't use 'new' for the shapes in main, we use cloning instead.
 */
public class Main {
    public static void main(String[] args) {
        // Load the expensive prototypes once
        ShapeCache.loadCache();

        // Getting cloned instances from the cache
        Shape clonedShape1 = ShapeCache.getShape("1");
        System.out.println("Shape 1: " + clonedShape1.getType());
        clonedShape1.draw();

        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape 2: " + clonedShape2.getType());
        clonedShape2.draw();

        // Proof that they are different objects in memory
        System.out.println("\nVerifying cloning:");
        System.out.println("Are they the same instance? " + (clonedShape1 == ShapeCache.getShape("1") ? "Yes" : "No"));
    }
}
