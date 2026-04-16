package flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * The Flyweight Factory.
 * It manages the shared objects and ensures they are reused.
 */
public class TreeFactory {
    private static Map<String, TreeType> treeTypes = new HashMap<>();

    /**
     * If a TreeType already exists, we return it. If not, we create a new one.
     */
    public static TreeType getTreeType(String name, String color, String otherTreeData) {
        String key = name + "_" + color;
        TreeType result = treeTypes.get(key);
        if (result == null) {
            result = new TreeType(name, color, otherTreeData);
            treeTypes.put(key, result);
            System.out.println("Created new TreeType: " + key);
        }
        return result;
    }
}
