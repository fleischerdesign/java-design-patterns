package facade;

/**
 * A complex component of our home theater system.
 */
public class TheaterLights {
    public void dim(int level) { System.out.println("Theater lights dimming to " + level + "%"); }
    public void on() { System.out.println("Theater lights on"); }
}
