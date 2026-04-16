package facade;

/**
 * A complex component of our home theater system.
 */
public class Amplifier {
    public void on() { System.out.println("Amplifier on"); }
    public void setVolume(int level) { System.out.println("Amplifier volume set to " + level); }
    public void off() { System.out.println("Amplifier off"); }
}
