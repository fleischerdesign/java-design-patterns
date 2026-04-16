package builder;

/**
 * A complex object that is difficult to create in one go.
 */
public class Computer {
    private String CPU;
    private String RAM;
    private String storage;
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    // Private constructor: only the Builder can create a Computer
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", storage=" + storage + 
               ", graphicsCard=" + isGraphicsCardEnabled + ", bluetooth=" + isBluetoothEnabled + "]";
    }

    /**
     * The static inner Builder class.
     */
    public static class Builder {
        private String CPU;
        private String RAM;
        private String storage;
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        // Mandatory parameters in the constructor
        public Builder(String cpu, String ram, String storage) {
            this.CPU = cpu;
            this.RAM = ram;
            this.storage = storage;
        }

        // Optional parameters return the builder itself (Fluent API)
        public Builder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public Builder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        /**
         * The final step that creates the actual Computer object.
         */
        public Computer build() {
            return new Computer(this);
        }
    }
}
