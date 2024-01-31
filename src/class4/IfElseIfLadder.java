package class4;

public class IfElseIfLadder {
    public static void main(String[] args) {
        int mark = 71;

        if (mark >= 80 && mark <= 100) {
            System.out.println("Your grade is A++");
        } else if (mark >= 70 && mark <= 79) {
            System.out.println("Your grade is A");
        } else if (mark >= 60 && mark <= 69) {
            System.out.println("Your grade is B");
        } else if (mark >= 40 && mark <= 59) {
            System.out.println("Your grade is C");
        } else {
            System.out.println("Fail");
        }
    }
}
