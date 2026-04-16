package bridge;

/**
 * The Abstraction.
 * It holds a reference to the implementation (the bridge).
 */
public abstract class Shape {
    protected Renderer renderer; // This is the bridge

    protected Shape(Renderer renderer) {
        this.renderer = renderer;
    }

    public abstract void draw();
}
