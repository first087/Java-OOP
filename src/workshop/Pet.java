package workshop;

/**
 * Created by Artit on 8/6/2559.
 */
public abstract class Pet {
    private String color;
    private int legs;

    public abstract String speak();

    public void echo() {
        System.out.println("Ah ammmm!");
    }
}
