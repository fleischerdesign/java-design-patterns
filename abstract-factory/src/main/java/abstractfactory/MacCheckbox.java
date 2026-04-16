package abstractfactory;

/**
 * Concrete product for Mac style checkbox.
 */
public class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Mac Checkbox.");
    }
}
