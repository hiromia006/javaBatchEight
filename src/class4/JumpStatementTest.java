package class4;

public class JumpStatementTest {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 45,85,60};

        //or(data_type var : array_name)
        for (int number : numbers) {
            if (number==20) continue;
            System.out.println(number);
        }

    }
}
