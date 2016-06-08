package workshop;

/**
 * Created by Artit on 8/6/2559.
 */
public class Dog {
    private String color;
    private int legs;

    public Dog(String color, int legs) {
        this.color = color;
        this.legs = legs;
    }

    public String speak() {
        return "Box Box";
    }

    public void run() {
        System.out.println("Dog can run");
    }
}
