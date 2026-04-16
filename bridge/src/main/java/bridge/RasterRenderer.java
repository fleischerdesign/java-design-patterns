package bridge;

/**
 * Concrete implementation for raster (pixel) graphics.
 */
public class RasterRenderer implements Renderer {
    @Override
    public void render(String shapeData) {
        System.out.println("RASTER: Drawing " + shapeData);
    }
}
