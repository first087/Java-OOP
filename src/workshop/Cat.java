package workshop;

/**
 * Created by Artit on 8/6/2559.
 */
public class Cat extends Pet {
    public Cat(String color, int legs) {
        super(color, legs);
    }

    @Override
    public String speak() {
        echo();
        return "Meaw Meaw";
    }

    public void run() {
        System.out.println("Cat can run");
    }
}
