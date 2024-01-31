package class2;

public class JavaVariablesTest {
    String name = "";
    static int age = 25;



    { // block 1
        int a = 6;
        System.out.println(a);
    }

    { // block 2
        System.out.println(name);
//        System.out.println(a);
    }
}
