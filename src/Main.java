import workshop.Car;
import workshop.FirstClass;

public class Main {
    public static void main(String[] args) {
//        OOPWorkshop1();
//        OOPWorkshop2();
//        OOPWorkshop3();
//        OOPWorkshop4();
//        OOPWorkshop5();
//        OOPWorkshop6();
    }

    private static void OOPWorkshop1() {
        // Workshop #1 - Class vs Object

        // Create 3 objects from class FirstClass
        FirstClass object1 = new FirstClass();
        FirstClass object2 = new FirstClass();
        FirstClass object3 = new FirstClass();

        System.out.println(object1.getDateCreate());
        System.out.println(object2.getDateCreate());
        System.out.println(object3.getDateCreate());

        // Run!
    }

    private static void OOPWorkshop2() {
        // Workshop #2 - Constructor and Destructor

        // ----- PART 1 -----
        // At class Car in folder workshop
        // Create constructor and print log in constructor

        Car car1 = new Car();

        // Run!

        // ----- PART 2 -----
        // Add 1 parameter to constructor [String color]
        // Set value from color to mColor and print log in constructor
        // Create Destructor and free mColor

        Car car2 = new Car("red");

        // Run!
        // Change mColor to color and fix problem
        // Run again!
    }

    private static void OOPWorkshop3() {
        // Workshop #3 - Attribute / Member and Method

        // At class Car in folder workshop
        // Create 1 attribute [int gear]
        // Initialize gear = 0 in constructor
        // Add getter for gear
        // Add method gearUp(), gearDown() and set gear++, gear-- in method and print log in method

        Car car1 = new Car("green");
        Car car2 = new Car("blue");

        car1.gearUp();
        System.out.println("car1 have current gear = " + String.valueOf(car1.getGear()));

        car2.gearUp();
        car2.gearUp();
        System.out.println("car2 have current gear = " + String.valueOf(car2.getGear()));

        car1.gearDown();
        System.out.println("car1 have current gear = " + String.valueOf(car1.getGear()));

        car2.gearDown();
        System.out.println("car2 have current gear = " + String.valueOf(car2.getGear()));

        // Run!
    }

    private static void OOPWorkshop4() {
        // Workshop 4 - Overload

        // At class Car in folder workshop
        // Add method gearUp(int step), gearDown(int step), update gear attribute and print log in method

        Car car = new Car();

        car.gearUp();
        car.gearUp(2);
        System.out.println("car have current gear = " + String.valueOf(car.getGear()));

        car.gearDown();
        car.gearDown(2);
        System.out.println("car have current gear = " + String.valueOf(car.getGear()));

        // Run!
    }

    private static void OOPWorkshop5() {
        // Workshop 5 - Override

        Car car = new Car("gold");

        System.out.println("Call method toString() -> " + car.toString());

        // Run!

        // At class Car in folder workshop
        // Override method toString() and return "This is {color} car"

        // Run again!
    }

    private static void OOPWorkshop6() {
        // Workshop 6 - Interface and Implement

        // Create interface IAnimal into folder workshop
        // Add getter/setter for attribute name (type String)
        // Add getter/setter for attribute age (type int)
        // Add getter/setter for attribute canFly (type boolean)
        // Add method Speak() (return String)
        // Create class Animal into folder workshop
        // Implement Animal with IAnimal

        // TODO : Uncomment below
//        IAnimal animal = new Animal("tweety", 2);
//        animal.setCanFly(true);
//        System.out.println(
//                        "Animal name = " + animal.getName() + "\n"
//                        + "\tage = " + animal.getAge() + "\n"
//                        + "\tcanFly = " + animal.isCanFly()
//        );
//        System.out.println("Animal speak = " + animal.Speak());

        // Run!
    }
}
