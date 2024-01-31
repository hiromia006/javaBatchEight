package class4;

public class EachLoopTest {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 45};

        //or(data_type var : array_name)
        for (int number : numbers) {
            System.out.println(number);
        }

        String names[] = {"lubaba", "raju", "afroza", "hiro"};
        for (String n : names) {
            System.out.println(n);
        }
    }
}
