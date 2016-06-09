package workshop;

/**
 * Created by Artit on 9/6/2559.
 */
public class Rectangle extends Shape implements IShape {

    public Rectangle(int width, int height) {
        super(width, height, "Rectangle formula = Width x Height");
        printFormula();
    }

    public long calculateArea() {
        return width * height;
    }

    private void printFormula() {
        System.out.println(formula);
    }

    @Override
    public void setDimension(int width, int height) {
        this.width = width;
        this.height = height;
    }
}
