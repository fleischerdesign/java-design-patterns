package abstractfactory;

/**
 * Concrete product for Windows style checkbox.
 */
public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Windows Checkbox.");
    }
}
