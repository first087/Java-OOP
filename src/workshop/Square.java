package workshop;

/**
 * Created by Artit on 9/6/2559.
 */
public class Square extends Shape implements IShape {

    public Square(int width) {
        super(width, width, "Square formula = Width x Width");
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
        throw new UnsupportedOperationException("Use overload 1 parameter");
    }

    public void setDimension(int width) {
        this.width = width;
        this.height = width;
    }
}
