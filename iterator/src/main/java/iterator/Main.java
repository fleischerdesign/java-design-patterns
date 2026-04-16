package iterator;

/**
 * Demonstrating the Iterator pattern.
 * We iterate through the names without accessing the underlying array directly.
 */
public class Main {
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        System.out.println("--- Iterating through names ---");
        // We use the iterator provided by the repository
        for (Iterator iter = namesRepository.getIterator(); iter.hasNext();) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
    }
}
