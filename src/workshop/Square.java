package workshop;

/**
 * Created by Artit on 9/6/2559.
 */
public class Square implements IShape {
    private int width;
    private int height;
    private String formula;

    public Square(int width) {
        this.width = width;
        this.height = width;
        formula = "Width x Width";
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
