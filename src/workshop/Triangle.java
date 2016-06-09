package workshop;

/**
 * Created by Artit on 9/6/2559.
 */
public class Triangle {
    private int width;
    private int height;
    private String formula;

    public Triangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public long calculateArea() {
        return width * height;
    }

    private void printFormula() {
        System.out.println("Formula = " + formula);
    }
}
