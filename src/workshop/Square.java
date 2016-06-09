package workshop;

/**
 * Created by Artit on 9/6/2559.
 */
public class Square extends Shape implements IShape {

    public Square(int width) {
        super(width, width, "Square formula = Width x Width");
        printFormula();
    }

    @Override
    public long calculateArea() {
        return width * height;
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
