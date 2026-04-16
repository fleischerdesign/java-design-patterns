package prototype;

/**
 * The Prototype interface that supports cloning.
 * It implements Cloneable, a standard Java interface.
 */
public abstract class Shape implements Cloneable {
    private String id;
    protected String type;

    abstract void draw();

    public String getType() { return type; }
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    /**
     * This method handles the actual cloning logic.
     */
    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
