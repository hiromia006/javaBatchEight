package class4;

public class DoWhileTest {
    public static void main(String[] args) {
        int i = 2;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        System.out.println("==============================");
        int j = 2;
        do {
            System.out.println(j);
            j++;
        } while (j <= 10);
    }
}
