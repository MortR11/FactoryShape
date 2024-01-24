import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Main class to demonstrate the canvas with random shapes.
 */
public class Main {
    public static void main(String[] args) {
        List<CShape> randomShapes = generateRandomShapes(10);
        CCanvas canvas = new CCanvas(randomShapes);
        System.out.println(canvas.getCanvasDetails());
    }

    /**
     * Generate a list of random non-duplicate shapes.
     *
     * @param count The number of shapes to generate.
     * @return List of random non-duplicate shapes.
     */
    private static List<CShape> generateRandomShapes(int count) {
        List<CShape> shapes = new ArrayList<>();
        Random random = new Random();

        while (shapes.size() < count) {
            int choice = random.nextInt(4); // 0 for Oval, 1 for Circle, 
 switch (choice) {
                case 0:
                    COval oval = new COval(random.nextInt(100) + 1, random.nextInt(100) + 1);
                    if (!shapes.contains(oval)) {
                        shapes.add(oval);
                    }
                    break;
                case 1:
                    CCircle circle = new CCircle(random.nextInt(100) + 1);
                    if (!shapes.contains(circle)) {
                        shapes.add(circle);
                    }
                    break;
                case 2:
                    CRectangle rectangle = new CRectangle(random.nextInt(100) + 1, random.nextInt(100) + 1);
                    if (!shapes.contains(rectangle)) {
                        shapes.add(rectangle);
                    }
                    break;
                case 3:
                    CSquare square = new CSquare(random.nextInt(100) + 1);
                    if (!shapes.contains(square)) {
                        shapes.add(square);
                    }
                    break;
            }
        }

        return shapes;
    }
}
