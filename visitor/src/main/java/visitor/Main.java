package visitor;

/**
 * Demonstrating the Visitor pattern.
 * We can add new visitors to perform different operations without changing the hardware classes.
 */
public class Main {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        
        // The display visitor 'visits' each part of the computer
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
