/**
 * Class which represents a circle, that is a specific type of oval.
 */
class CCircle extends COval {

    /**
     * Initializes the circle with a given radius.
     *
     * @param radius The radius of the circle.
     */
    public CCircle(int radius) {
        super(radius, radius);
    }

    /**
     * Get details of the circle.
     *
     * @return Details of the circle.
     */
    @Override
    public String getDetails() {
        return "CIRCLE " + horizontalRadius;
    }
}

