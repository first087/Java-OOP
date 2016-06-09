package workshop;

/**
 * Created by Artit on 9/6/2559.
 */
public class Triangle extends Shape implements IShape {

    public Triangle(int width, int height) {
        super(width, height);
        formula = "Width x Height / 2";
        printFormula();
    }

    public long calculateArea() {
        return width * height / 2;
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
