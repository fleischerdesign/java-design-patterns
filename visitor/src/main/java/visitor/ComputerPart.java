package visitor;

/**
 * The Element interface.
 * It defines the 'accept' method to let a visitor in.
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor visitor);
}
