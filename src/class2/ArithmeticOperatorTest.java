package class2;

public class ArithmeticOperatorTest {
    public static void main(String[] args) {
        int number2 = 50, number3;
         int number1 = 70;

        number3 = number2 - number1; //20
        System.out.println(number3);

        number3 = number3 - number1; //20-50= -30
        System.out.println(number3++);

        number1 = number3 + number1; //-30+50=20
        System.out.println(number1);

        ++number2;
        System.out.println(number2);
        System.out.println(number1 / 15); //20/15=1

        System.out.println(++number3 % 6);//-30+1=29%6=5


    }
}
