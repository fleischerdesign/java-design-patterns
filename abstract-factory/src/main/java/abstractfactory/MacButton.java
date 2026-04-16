package abstractfactory;

/**
 * Concrete product for Mac style button.
 */
public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Mac Button.");
    }
}
