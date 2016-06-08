package workshop;

/**
 * Created by Artit on 8/6/2559.
 */
public class Animal implements IAnimal {
    private String name;
    private int age;
    private boolean canFly;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean isCanFly() {
        return canFly;
    }

    @Override
    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    @Override
    public String Speak() {
        return "I can see maw meaw!";
    }
}
