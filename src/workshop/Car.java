package workshop;

/**
 * Created by Ethan on 5/31/2016 AD.
 */
public class Car {
    // Attribute / Member
    private String color;
    private int gear;

    // Constructor

    public Car() {
        gear = 0;
        System.out.println("Execute in constructor of class Car");
    }

    public Car(String color) {
        this.color = color;
        gear = 0;
        System.out.println("Execute in constructor of class Car with color = " + color);
    }

    // Destructor
    @Override
    protected void finalize() throws Throwable {
        color = null;
        super.finalize();
    }

    // Getter

    // Method
}
