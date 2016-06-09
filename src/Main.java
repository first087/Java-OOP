import workshop.*;

public class Main {
    public static void main(String[] args) {
//        OOPWorkshop1();
//        OOPWorkshop2();
//        OOPWorkshop3();
//        OOPWorkshop4();
//        OOPWorkshop5();
//        OOPWorkshop6();
//        OOPWorkshop7();
//        OOPWorkshop8();
        OOPWorkshop9();
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
        IAnimal animal = new Animal("tweety", 2);
        animal.setCanFly(true);
        System.out.println(
                        "Animal name = " + animal.getName() + "\n"
                        + "\tage = " + animal.getAge() + "\n"
                        + "\tcanFly = " + animal.isCanFly()
        );
        System.out.println("Animal speak = " + animal.Speak());

        // Run!
    }

    private static void OOPWorkshop7() {
        // Workshop 7 - Abstract Class and Inherit / Extend

        // ----- PART 1 -----
        // Create class Dog, Cat and Bird into folder workshop
        // Add attribute color (type String) in 3 classes
        // Add attribute legs (type int) in 3 classes
        // Add constructor with 2 parameter for initial 2 attributes
        // Add method speak (return String) in 3 classes
        // Add method run (return void) in class Dog and Cat
        // Add method fly (return void) in class Bird

        // TODO : Uncomment below
        Dog dog = new Dog("brown", 4);
        Cat cat = new Cat("white", 4);
        Bird bird = new Bird("blue", 2);

        System.out.println("Dog speak " + dog.speak());
        System.out.println("Cat speak " + cat.speak());
        System.out.println("Bird speak " + bird.speak());

        dog.run();
        cat.run();
        bird.fly();

        // Run!

        System.out.println("----- END PART 1 -----");

        // ----- PART 2 -----
        // Create abstract class Pet into folder workshop
        // Add attribute color (type String)
        // Add attribute legs (type int)
        // Add constructor with 2 parameter for initial 2 attributes
        // Add abstract method speak (return String)
        // Add method echo (return void) and print log in method
        // Remove all attribute, method speak and code in constructor in class Dog, Cat and Bird
        // Refactor class Dog, Cat, Bird with extends class Pet
        // In method speak of class Dog, Cat, Bird call method echo

        // Run again!

        System.out.println("----- END PART 2 -----");

        // ----- PART 3 -----
        // TODO : Uncomment below
        Pet doggy = new Dog("brown", 4);
        Pet catty = new Cat("white", 4);
        Pet birdy = new Bird("blue", 2);

        System.out.println("Doggy speak " + doggy.speak());
        System.out.println("Catty speak " + catty.speak());
        System.out.println("Birdy speak " + birdy.speak());

        ((Dog)doggy).run();
        ((Cat)catty).run();
        ((Bird)birdy).fly();

        // Run!

        System.out.println("----- END PART 3 -----");
    }

    private static void OOPWorkshop8() {
        // Workshop 8 - Accessibility

        Pet doggy = new Dog("brown", 4);
        Pet catty = new Cat("white", 4);
        Pet birdy = new Bird("blue", 2);

        System.out.println("Doggy speak " + doggy.speak());
        System.out.println("Catty speak " + catty.speak());
        System.out.println("Birdy speak " + birdy.speak());

        ((Dog)doggy).run();
        ((Cat)catty).run();
        ((Bird)birdy).fly();

        // Run!
    }

    private static void OOPWorkshop9() {
        // Workshop 9 - Recap

        // Create class Rectangle, Triangle and Square into folder workshop
        // In 3 classes have attribute width, height and mathematical formula
        // In 3 classes have method for return calculate area
        // In 3 classes have method for print mathematical formula and call at constructor

        Rectangle rectangle = new Rectangle(30, 40);
        Triangle triangle = new Triangle(30, 40);
        Square square = new Square(35);

        System.out.println("Rectangle [30, 40] area = " + rectangle.calculateArea());
        System.out.println("Triangle [30, 40] area = " + triangle.calculateArea());
        System.out.println("Square [35] area = " + square.calculateArea());

        // Run!

        System.out.println("----- END PART 1 -----");

        // Create interface IShape into folder workshop
        // In interface define method `void setDimension(int, int)`
        // In 3 classes implement interface
        // In class Square overload method void setDimension with 1 parameter

        rectangle.setDimension(40, 50);
        triangle.setDimension(40, 50);
        square.setDimension(45);

        System.out.println("Rectangle [40, 50] area = " + rectangle.calculateArea());
        System.out.println("Triangle [40, 50] area = " + triangle.calculateArea());
        System.out.println("Square [45] area = " + square.calculateArea());

        // Run!

        System.out.println("----- END PART 2 -----");

        // Refactor 3 classes use abstract class Shape
        // Set accessibility for hidden Shape constructor method for print mathematical formula

        // Run again!

        System.out.println("----- END PART 3 -----");

        // Create class Circle and inherit from class Square
        // Use override every method

        Circle circle = new Circle(70);
        System.out.println("Circle [70] area = " + circle.calculateArea());
        circle.setDimension(14);
        System.out.println("Circle [14] area = " + circle.calculateArea());

        // Run!

        System.out.println("----- END PART 4 -----");
    }
}
