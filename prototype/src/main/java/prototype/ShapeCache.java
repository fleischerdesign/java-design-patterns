package prototype;

import java.util.Hashtable;

/**
 * A registry that holds prototypes.
 * Instead of creating new objects, it returns clones of the stored prototypes.
 */
public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

    /**
     * We don't return the original object, but a clone!
     */
    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    /**
     * Here we simulate a heavy database query to load our prototypes.
     * We only do this once.
     */
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(), rectangle);
        
        System.out.println("Cache loaded with prototypes (simulated expensive operation).");
    }
}
