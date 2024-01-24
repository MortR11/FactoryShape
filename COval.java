/**
 * Class representing an oval, which is a specific type of shape.
 */
class COval extends CShape {
    protected int horizontalRadius;
    protected int verticalRadius;

    /**
     * Constructor that initializes the oval with given horizontal and vertical radius.
     *
     * @param horizontalRadius The horizontal radius of the oval.
     * @param verticalRadius   The vertical radius of the oval.
     */
    public COval(int horizontalRadius, int verticalRadius) {
        super();
        this.horizontalRadius = horizontalRadius;
        this.verticalRadius = verticalRadius;
    }

    /**
     * Gets details of the oval.
     *
     * @return Details of the oval.
     */
    @Override
    public String getDetails() {
        return "OVAL " + horizontalRadius + "x" + verticalRadius;
    }
}

