package observer;

/**
 * Main class to demonstrate the Observer pattern.
 * We create a news agency and some channels, then see how they get notified.
 */
public class Main {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();
        
        NewsChannel channel1 = new NewsChannel("Channel 1");
        NewsChannel channel2 = new NewsChannel("Channel 2");
        
        // Registering observers
        newsAgency.attach(channel1);
        newsAgency.attach(channel2);
        
        // This will notify all registered channels
        newsAgency.setNews("Breaking News: Observer Pattern Implemented!");
        
        // Removing one observer
        newsAgency.detach(channel1);
        
        // Now only Channel 2 will receive the update
        newsAgency.setNews("Update: Channel 1 detached.");
    }
}
