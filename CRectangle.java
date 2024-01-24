/**
 * Class representing a rectangle, a specific type of shape.
 */
class CRectangle extends CShape {
    protected int length;
    protected int width;

    /**
     * Constructor to initialize the rectangle with given length and width.
     *
     * @param length The length of the rectangle.
     * @param width  The width of the rectangle.
     */
    public CRectangle(int length, int width) {
        super();
        this.length = length;
        this.width = width;
    }

    /**
     * Get details of the rectangle.
     *
     * @return Details of the rectangle.
     */
    @Override
    public String getDetails() {
        return "RECTANGLE " + length + "x" + width;
    }
}

