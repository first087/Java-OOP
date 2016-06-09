package workshop;

/**
 * Created by Artit on 9/6/2559.
 */
public class Circle extends Square {

    public Circle(int width) {
        super(width);
    }

    @Override
    protected void printFormula() {
        formula = "Circle formula = Pi x (Diameter / 2) x (Diameter / 2)";
        super.printFormula();
    }

    @Override
    public long calculateArea() {
        return (width / 2) * (width / 2) * 22 / 7;
    }

    @Override
    public void setDimension(int diameter) {
        super.setDimension(diameter);
    }
}
