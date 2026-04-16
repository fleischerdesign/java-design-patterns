package facade;

/**
 * Demonstrating the Facade pattern.
 * The client only needs to know about the HomeTheaterFacade, not the individual devices.
 */
public class Main {
    public static void main(String[] args) {
        // We create the complex subsystem components
        Amplifier amp = new Amplifier();
        DvdPlayer dvd = new DvdPlayer();
        Projector projector = new Projector();
        TheaterLights lights = new TheaterLights();

        // We wrap them in a simple Facade
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, dvd, projector, lights);

        // Instead of 10 calls, we just call one method
        homeTheater.watchMovie("Inception");
        
        System.out.println("\n--- Movie is over ---\n");
        
        homeTheater.endMovie();
    }
}
