import java.util.List;

/**
 * Class representing a canvas, containing a list of shapes.
 */
class CCanvas {
    private List<CShape> shapes;

    /**
     * Constructor to initialize the canvas with a list of shapes.
     *
     * @param shapes The list of shapes for the canvas.
     */
    public CCanvas(List<CShape> shapes) {
        this.shapes = shapes;
    }

    /**
     * Get details of all shapes on the canvas.
     *
     * @return A formatted string containing details of all shapes on the canvas.
     */
    public String getCanvasDetails() {
        StringBuilder canvasDetails = new StringBuilder("Canvas has the following random shapes:\n");
        for (int i = 0; i < shapes.size(); i++) {
            canvasDetails.append("Shape ").append(i + 1).append(": ").append(shapes.get(i).getDetails()).append("\n");
        }
        return canvasDetails.toString();
    }
}

