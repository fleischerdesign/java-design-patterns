package bridge;

/**
 * Refined Abstraction.
 */
public class Circle extends Shape {
    private float radius;

    public Circle(Renderer renderer, float radius) {
        super(renderer);
        this.radius = radius;
    }

    @Override
    public void draw() {
        // We delegate the actual rendering to the bridge
        renderer.render("a circle with radius " + radius);
    }
}
