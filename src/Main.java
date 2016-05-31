import workshop.Car;
import workshop.FirstClass;

public class Main {
    public static void main(String[] args) {
//        OOPWorkshop1();
//        OOPWorkshop2();
    }

    private static void OOPWorkshop1() {
        // Workshop #1 - Class vs Object
        // Create 3 Objects from class FirstClass
        FirstClass object1 = null;  // TODO : Create Object 1 from class FirstClass
        FirstClass object2 = null;  // TODO : Create Object 2 from class FirstClass
        FirstClass object3 = null;  // TODO : Create Object 3 from class FirstClass

        System.out.println(object1.getDateCreate());
        System.out.println(object2.getDateCreate());
        System.out.println(object3.getDateCreate());
    }

    private static void OOPWorkshop2() {
        // Workshop #2 - Constructor / Destructor
        // At class Car in folder workshop
        // Create Constructor with 1 parameter [String color]
        // Set value from color to mColor and print log in constructor
        // Create Destructor and free mColor

        Car car = null; // TODO : Create object from class Car
    }
}
