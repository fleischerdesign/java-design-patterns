package facade;

/**
 * The Facade class.
 * it simplifies the interaction with multiple complex subsystem components.
 */
public class HomeTheaterFacade {
    private Amplifier amp;
    private DvdPlayer dvd;
    private Projector projector;
    private TheaterLights lights;

    public HomeTheaterFacade(Amplifier amp, DvdPlayer dvd, Projector projector, TheaterLights lights) {
        this.amp = amp;
        this.dvd = dvd;
        this.projector = projector;
        this.lights = lights;
    }

    /**
     * One simple method to start the whole system.
     */
    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        lights.dim(10);
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
    }

    /**
     * One simple method to shut everything down.
     */
    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        lights.on();
        projector.off();
        amp.off();
        dvd.stop();
        dvd.off();
    }
}
