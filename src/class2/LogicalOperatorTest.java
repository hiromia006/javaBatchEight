package class2;

public class LogicalOperatorTest {
    public static void main(String[] args) {
        int number1 = 30, number2 = 70;

        System.out.println(number1 > number2 && number2 > number1);
        System.out.println(number1 > number2 || number2 > number1);
        System.out.println(number1 != number2 && number2 > number1);
    }
}
