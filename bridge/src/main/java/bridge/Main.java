package bridge;

/**
 * Demonstrating the Bridge pattern.
 * We can combine any Shape with any Renderer at runtime.
 */
public class Main {
    public static void main(String[] args) {
        Renderer vector = new VectorRenderer();
        Renderer raster = new RasterRenderer();

        // One shape, two different ways of rendering
        Shape circle = new Circle(vector, 5);
        Shape square = new Square(raster, 10);
        
        // Another shape with the vector renderer
        Shape vectorSquare = new Square(vector, 7);

        circle.draw();
        square.draw();
        vectorSquare.draw();
    }
}
