package abstractfactory;

/**
 * The Client class that uses the Abstract Factory.
 * It only knows about the abstract interfaces, not the concrete classes.
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        // The factory decides which concrete objects are created
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
