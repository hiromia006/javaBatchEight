package class3;

public class Bird {
    public String name;
    protected String color;
    int number_of_wings;
    private boolean feathers;

    public Bird() {

    }

    public Bird(String name, boolean feathers) {
        this.name = name;
        this.feathers = feathers;
    }

    public String getName() {
        return name;
    }

    public boolean isFeathers() {
        return feathers;
    }

    public static void main(String[] args) {
        Bird bird = new Bird("Dove", true);
        System.out.println(bird.getName());
        System.out.println(bird.isFeathers());
    }
}
