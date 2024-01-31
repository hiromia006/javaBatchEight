package class5;

public class Bicycle {
    private int gear=5;
    public int speed;

//    public Bicycle(int gear, int speed) {
//        this.gear = gear;
//        this.speed = speed;
//    }

    public void applyBrake(int decrement) {
        speed -= decrement;
        System.out.println(speed);
    }

    public void speedUp(int increment){
        speed+=increment;
        System.out.println(speed);
    }
}
