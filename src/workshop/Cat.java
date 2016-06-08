package workshop;

/**
 * Created by Artit on 8/6/2559.
 */
public class Cat {
    private String color;
    private int legs;

    public Cat(String color, int legs) {
        this.color = color;
        this.legs = legs;
    }

    public String speak() {
        return "Meaw Meaw";
    }

    public void run() {
        System.out.println("Cat can run");
    }
}
