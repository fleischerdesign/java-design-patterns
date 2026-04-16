package factory;

/**
 * Concrete implementation of a Circle.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle.");
    }
}
