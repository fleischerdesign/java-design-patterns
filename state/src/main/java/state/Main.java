package state;

/**
 * Demonstrating the State pattern.
 * Notice how the player reacts differently to the same methods as its state changes.
 */
public class Main {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();

        System.out.println("--- Action: Click Play ---");
        player.clickPlay();
        
        System.out.println("\n--- Action: Click Pause ---");
        player.clickPause();

        System.out.println("\n--- Action: Click Lock ---");
        player.clickLock();

        // While locked, the play button should not work
        System.out.println("\n--- Action: Click Play while locked ---");
        player.clickPlay();

        // Unlock it
        System.out.println("\n--- Action: Click Lock (to unlock) ---");
        player.clickLock();
        
        System.out.println("\n--- Action: Click Play again ---");
        player.clickPlay();
    }
}
