package workshop;

/**
 * Created by Artit on 9/6/2559.
 */
public class Triangle extends Shape implements IShape {

    public Triangle(int width, int height) {
        super(width, height, "Triangle formula = Width x Height / 2");
        printFormula();
    }

    @Override
    public long calculateArea() {
        return width * height / 2;
    }

    @Override
    public void setDimension(int width, int height) {
        this.width = width;
        this.height = height;
    }
}
