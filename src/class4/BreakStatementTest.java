package class4;

public class BreakStatementTest {
    public static void main(String[] args) {
        String names[] = {"lubaba", "raju", "afroza", "hiro"};

        for (String n : names) {
            if (n == "afroza") break;
            System.out.println(n);
        }
    }
}
