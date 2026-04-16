package proxy;

/**
 * The Proxy.
 * It stands in for the RealImage and controls when it is actually created.
 */
public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
        // The proxy is created instantly because it doesn't load the heavy file yet
        System.out.println("Thumbnail created for: " + fileName);
    }

    @Override
    public void display() {
        // Lazy loading: we only create the RealImage when it is really needed
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
