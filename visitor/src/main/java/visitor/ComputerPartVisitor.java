package visitor;

/**
 * The Visitor interface.
 * It defines visit methods for each type of element in the structure.
 */
public interface ComputerPartVisitor {
    void visit(Computer computer);
    void visit(Mouse mouse);
    void visit(Keyboard keyboard);
    void visit(Monitor monitor);
}
