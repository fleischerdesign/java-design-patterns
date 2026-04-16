package composite;

/**
 * Demonstrating the Composite pattern.
 * We build a tree structure and display it with a single call.
 */
public class Main {
    public static void main(String[] args) {
        // Leaf objects
        File f1 = new File("photo.jpg");
        File f2 = new File("config.txt");
        File f3 = new File("script.sh");

        // Composite objects
        Directory root = new Directory("Root");
        Directory docs = new Directory("Documents");
        Directory music = new Directory("Music");

        // Building the structure
        root.addComponent(docs);
        root.addComponent(music);
        root.addComponent(f3);

        docs.addComponent(f1);
        docs.addComponent(f2);
        
        music.addComponent(new File("song.mp3"));

        // The client treats the root directory just like a single file
        System.out.println("Printing the entire structure:");
        root.showDetails();
    }
}
