package workshop;

/**
 * Created by Artit on 9/6/2559.
 */
public abstract class Shape {
    protected int width;
    protected int height;
    protected String formula;

    protected Shape(int width, int height, String formula) {
        this.width = width;
        this.height = height;
        this.formula = formula;
    }

    public abstract long calculateArea();
}
