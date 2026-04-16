package proxy;

/**
 * The Real Subject.
 * This class represents a heavy object that takes time and memory to load.
 */
public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadHeavyFile();
    }

    /**
     * Simulating a slow and expensive loading process.
     */
    private void loadHeavyFile() {
        System.out.println(">>> [SYSTEM] Loading 20MB High-Res file: " + fileName + "... (takes 2 seconds)");
    }

    @Override
    public void display() {
        System.out.println(">>> [SCREEN] Rendering High-Res Image: " + fileName);
    }
}
