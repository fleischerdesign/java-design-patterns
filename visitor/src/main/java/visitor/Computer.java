package visitor;

/**
 * A composite element that contains other parts.
 */
public class Computer implements ComputerPart {
    ComputerPart[] parts;

    public Computer() {
        // A computer is made of multiple parts
        parts = new ComputerPart[] { new Mouse(), new Keyboard(), new Monitor() };
    }

    @Override
    public void accept(ComputerPartVisitor visitor) {
        // Let the visitor visit all child parts
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(visitor);
        }
        // Then visit the computer itself
        visitor.visit(this);
    }
}
