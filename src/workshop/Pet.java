package workshop;

/**
 * Created by Artit on 8/6/2559.
 */
public abstract class Pet {
    protected String color;
    protected int legs;

    protected Pet(String color, int legs) {
        this.color = color;
        this.legs = legs;
    }

    public abstract String speak();

    protected void echo() {
        System.out.println("Ah ammmm!");
    }
}