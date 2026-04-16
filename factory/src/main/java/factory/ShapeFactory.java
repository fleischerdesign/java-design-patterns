package factory;

/**
 * The Factory class that generates objects of concrete classes based on given information.
 */
public class ShapeFactory {

    /**
     * This method decides which shape to instantiate.
     * The client doesn't need to know about Circle or Square directly.
     */
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
