package proxy;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrating the Proxy pattern in a gallery scenario.
 * 500 images are represented by proxies, but only the clicked one is loaded.
 */
public class Main {
    public static void main(String[] args) {
        List<Image> gallery = new ArrayList<>();
        
        // Simulating 500 thumbnails being added to the view
        System.out.println("--- Opening Gallery ---");
        for (int i = 1; i <= 500; i++) {
            gallery.add(new ProxyImage("photo_" + i + ".jpg"));
        }
        
        System.out.println("\nGallery view is open. 500 Thumbnails are visible.");
        System.out.println("System RAM usage: Very low.\n");

        // The user clicks on one specific photo
        System.out.println("--- User clicks on photo_42 ---");
        gallery.get(41).display(); 

        System.out.println("\nUser closes the app. Performance and memory were saved.");
    }
}
