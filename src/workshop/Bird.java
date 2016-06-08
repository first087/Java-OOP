package workshop;

/**
 * Created by Artit on 8/6/2559.
 */
public class Bird {
    private String color;
    private int legs;

    public Bird(String color, int legs) {
        this.color = color;
        this.legs = legs;
    }

    public String speak() {
        return "Jib Jib";
    }

    public void fly() {
        System.out.println("Bird can fly");
    }
}
