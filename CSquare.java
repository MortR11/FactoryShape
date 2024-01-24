/**
 * Class representing a square, a specific type of rectangle.
 */
class CSquare extends CRectangle {

    /**
     * Constructor to initialize the square with a given side length.
     *
     * @param sideLength The side length of the square.
     */
    public CSquare(int sideLength) {
        super(sideLength, sideLength);
    }

    /**
     * Get details of the square.
     *
     * @return Details of the square.
     */
    @Override
    public String getDetails() {
        return "SQUARE " + length + "x" + width;
    }
}

