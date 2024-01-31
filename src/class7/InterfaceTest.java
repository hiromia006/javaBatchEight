package class7;

import java.util.List;

public class InterfaceTest extends Object{
    public static void main(String[] args) {
        System.out.println("DOg Object " + Dog.height);
        Dog dog = new Dog();
        dog.name = "saldjl";
        dog.sound();
        dog.eat();


        System.out.println("Animal variable : " + Animal.height);
        Animal animal = new Dog();
        animal.eat();


    }
}
