package command;

/**
 * The Receiver class.
 * It knows how to perform the actual work.
 */
public class Light {
    private String name;

    public Light(String name) { this.name = name; }

    public void on() { System.out.println(name + " light is ON"); }
    public void off() { System.out.println(name + " light is OFF"); }
}
