package workshop;

/**
 * Created by Artit on 9/6/2559.
 */
public class Square {
    private int width;
    private String formula;

    public Square(int width) {
        this.width = width;
        formula = "Width ^ 2";
    }

    public long calculateArea() {
        return width ^ 2;
    }

    private void printFormula() {
        System.out.println("Formula = " + formula);
    }
}
