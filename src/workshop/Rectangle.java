package workshop;

/**
 * Created by Artit on 9/6/2559.
 */
public class Rectangle implements IShape {
    private int width;
    private int height;
    private String formula;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        formula = "Width x Height";
        printFormula();
    }

    public long calculateArea() {
        return width * height;
    }

    private void printFormula() {
        System.out.println("Formula = " + formula);
    }

    @Override
    public void setDimension(int width, int height) {
        this.width = width;
        this.height = height;
    }
}
