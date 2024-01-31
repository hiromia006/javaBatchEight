package class7;

public interface Animal {
    //    public final static int height = 3;
    int height = 3;

    //public abstract void printInterestRate();
    void eat();

    void sleep();

    void move();

    public default void hunt() {
        System.out.println("Hunting");
    }
}
