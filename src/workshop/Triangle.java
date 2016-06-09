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
        formula = "Width x Height / 2";
        printFormula();
    }

    public long calculateArea() {
        return width * height / 2;
    }

    private void printFormula() {
        System.out.println("Formula = " + formula);
    }
}
