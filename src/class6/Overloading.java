package class6;

public class Overloading {

    public void login() {
        System.out.println("Please enter username & Password");
    }

    public void login(String username) {
        System.out.println("Please enter password");
    }

    public void login(String username, String password) {
        System.out.println("Login Successfully");
    }

    public void add(int number1, int number2) {
        System.out.println("Summation is " + (number1 + number2));
    }

    public void add(int number1, int number2, int number3) {
        System.out.println("Summation is " + (number1 + number2 + number3));
    }

    public void add() {
        System.out.println("Summation " + (10 + 50));
    }

    public static void main(String[] args) {
        Overloading overloading = new Overloading();
        overloading.add();
        overloading.add(90, 100);
        overloading.add(50, 80, 90);
    }
}
