package workshop;

/**
 * Created by Artit on 8/6/2559.
 */
public class Dog extends Pet {
    public Dog(String color, int legs) {
        super(color, legs);
    }

    @Override
    public String speak() {
        System.out.println(color + " dog have " + legs + " legs");
        echo();
        return "Box Box";
    }

    public void run() {
        System.out.println("Dog can run");
    }
}