package class6;

public class EncapsulationTest {
    public static void main(String[] args) {
        ReadOnlyTest readOnlyTest = new ReadOnlyTest();
        System.out.println(readOnlyTest.getName());

        WriteOnlyTest writeOnlyTest = new WriteOnlyTest();
        writeOnlyTest.setName("Sharif");
    }
}
