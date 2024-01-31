package class4;

public class NestedIfStatementTest {
    public static void main(String[] args) {
        int age = 20, weight = 65;

        if (age >= 18) {
            if (weight >= 60) {
                System.out.println("Eligible to donate blood");
            }
        }

        if (age >= 18 && weight >= 60) {
            System.out.println("Eligible to donate blood");
        }
    }
}
