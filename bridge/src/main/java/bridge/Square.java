package bridge;

/**
 * Refined Abstraction.
 */
public class Square extends Shape {
    private float side;

    public Square(Renderer renderer, float side) {
        super(renderer);
        this.side = side;
    }

    @Override
    public void draw() {
        // Delegating to the bridge
        renderer.render("a square with side length " + side);
    }
}
