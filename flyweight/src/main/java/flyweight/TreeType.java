package flyweight;

/**
 * The Flyweight class.
 * It contains the intrinsic state (shared data) like name and color.
 */
public class TreeType {
    private String name;
    private String color;
    private String otherTreeData; // Imagine heavy textures or 3D data here

    public TreeType(String name, String color, String otherTreeData) {
        this.name = name;
        this.color = color;
        this.otherTreeData = otherTreeData;
    }

    public void draw(int x, int y) {
        System.out.println("Drawing tree [" + name + ", " + color + "] at (" + x + ", " + y + ")");
    }
}
