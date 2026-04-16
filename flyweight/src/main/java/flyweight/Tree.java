package flyweight;

/**
 * The Context class.
 * It contains the extrinsic state (unique data like position) 
 * and a reference to the shared Flyweight object.
 */
public class Tree {
    private int x;
    private int y;
    private TreeType type; // Shared data

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw() {
        type.draw(x, y);
    }
}
