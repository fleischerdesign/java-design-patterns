package bridge;

/**
 * Concrete implementation for vector graphics.
 */
public class VectorRenderer implements Renderer {
    @Override
    public void render(String shapeData) {
        System.out.println("VECTOR: Drawing " + shapeData);
    }
}
