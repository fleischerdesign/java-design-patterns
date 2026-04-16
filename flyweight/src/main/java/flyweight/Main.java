package flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrating the Flyweight pattern.
 * We plant many trees but only create two TreeType objects.
 */
public class Main {
    public static void main(String[] args) {
        List<Tree> forest = new ArrayList<>();

        System.out.println("Planting trees...");

        // Planting 5 Oaks
        for (int i = 0; i < 5; i++) {
            TreeType oakType = TreeFactory.getTreeType("Oak", "Green", "Heavy texture data...");
            forest.add(new Tree(i * 10, i * 10, oakType));
        }

        // Planting 5 Birches
        for (int i = 0; i < 5; i++) {
            TreeType birchType = TreeFactory.getTreeType("Birch", "White", "Light texture data...");
            forest.add(new Tree(i * 15, i * 15, birchType));
        }

        System.out.println("\nDrawing the forest:");
        for (Tree tree : forest) {
            tree.draw();
        }
        
        System.out.println("\nTotal trees in forest: " + forest.size());
        System.out.println("Only 2 TreeType objects are stored in memory!");
    }
}
