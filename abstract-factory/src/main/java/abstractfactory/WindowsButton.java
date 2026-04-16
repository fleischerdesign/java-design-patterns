package abstractfactory;

/**
 * Concrete product for Windows style button.
 */
public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Windows Button.");
    }
}
