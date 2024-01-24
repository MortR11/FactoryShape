/**
 * Abstract class representing a shape.
 */
abstract class CShape {
    private static int idCounter = 0;
    protected int id;

    /**
     * Constructor to initialize the shape's unique ID.
     */
    public CShape() {
        this.id = ++idCounter;
    }

    /**
     * To get the details of the shape.
     *
     * @return Details of the shape.
     */
    public abstract String getDetails();
}

