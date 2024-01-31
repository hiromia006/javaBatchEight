package class2;

public class AssignmentOperatorTest {
    public static void main(String[] args) {
        int number1 = 30, number2 = 70, number3;

        number1 += number2; //number1=number1+number2; 30+70=100
        System.out.println(number1);
        number1 -= number2;//100-70=30 number1=number1-number
        System.out.println(number1);
        number1 /= 5;
        System.out.println(number1);
        number2*=number1;
        System.out.println(number2);
    }
}
