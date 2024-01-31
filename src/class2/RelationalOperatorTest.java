package class2;

public class RelationalOperatorTest {
    public static void main(String[] args) {
        int number1 = 30, number2 = 70, number3;

        number3 = number1 + number1;
        System.out.println(number3 > number2);
        System.out.println(number1++ < ++number1); //
        System.out.println(number3 >= number1);

        number3 = number2 - number1;

        System.out.println(number3 == number3);
        System.out.println(number2 != number1);
    }
}
