package class7;

public class Dog implements Animal {
    protected String name = "German ..";

    @Override
    public void eat() {
        System.out.println("Dog eats meat");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps nine hours");
    }

    @Override
    public void move() {
        System.out.println("Dog moves night");
    }

    public void sound() {
        System.out.println("Dog barks");
    }
}
