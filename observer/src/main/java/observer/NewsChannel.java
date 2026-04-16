package observer;

/**
 * NewsChannel is a concrete Observer.
 * It reacts to updates by printing the news to the console.
 */
public class NewsChannel implements Observer {
    private String name;

    public NewsChannel(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " received news: " + news);
    }
}
