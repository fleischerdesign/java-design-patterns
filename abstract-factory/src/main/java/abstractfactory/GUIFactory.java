package abstractfactory;

/**
 * The Abstract Factory interface.
 * It defines methods for creating families of related products.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
