package strategy;

/**
 * Main class to demonstrate the Strategy pattern.
 * We can swap the navigation logic without changing the client code.
 */
public class Main {
    public static void main(String[] args) {
        new Navigator()
            .from("Berlin")
            .to("Hamburg")
            .using(new PublicTransportStrategy())
            .build();
    }
}
