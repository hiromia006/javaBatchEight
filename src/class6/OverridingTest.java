package class6;

public class OverridingTest {
    public static void main(String[] args) {
        CityBank cityBank = new CityBank();
        cityBank.printInterestRate();

        BangladeshBank bangladeshBank=new CityBank();
        bangladeshBank.printInterestRate();


        BracBank bracBank = new BracBank();
        bracBank.printInterestRate();
    }
}
