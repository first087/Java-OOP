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
        this.color = "default";
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
    public int getGear() {
        return gear;
    }

    // Method
    public void gearUp() {
        int oldGear = gear;
        gear++;
        System.out.println(color + " Car change gear from " + oldGear + " to " + gear);
    }

    public void gearUp(int step) {
        int oldGear = gear;
        gear += step;
        System.out.println(color + " Car change gear from " + oldGear + " to " + gear);
    }

    public void gearDown() {
        int oldGear = gear;
        gear--;
        System.out.println(color + " Car change gear from " + oldGear + " to " + gear);
    }

    public void gearDown(int step) {
        int oldGear = gear;
        gear -= step;
        System.out.println(color + " Car change gear from " + oldGear + " to " + gear);
    }
}
