package workshop;

/**
 * Created by Artit on 8/6/2559.
 */
public class Bird extends Pet {
    public Bird(String color, int legs) {
        super(color, legs);
    }

    @Override
    public String speak() {
        echo();
        return "Jib Jib";
    }

    public void fly() {
        System.out.println("Bird can fly");
    }
}
