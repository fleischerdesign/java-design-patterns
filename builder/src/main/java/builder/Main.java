package builder;

/**
 * Main class to demonstrate the Builder pattern.
 * We use the 'fluent' style to configure the computer step by step.
 */
public class Main {
    public static void main(String[] args) {
        // Configuring a high-end computer
        Computer comp = new Computer.Builder("Intel i7", "16GB", "512GB SSD")
                .setGraphicsCardEnabled(true)
                .setBluetoothEnabled(true)
                .build();
        
        System.out.println(comp);

        // Configuring a basic computer without optional features
        Computer basicComp = new Computer.Builder("AMD Ryzen 5", "8GB", "256GB SSD")
                .build();

        System.out.println(basicComp);
    }
}
