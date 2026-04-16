package visitor;

/**
 * A concrete Element.
 */
public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor visitor) {
        // Double Dispatch: the component calls the correct visit method on the visitor
        visitor.visit(this);
    }
}
