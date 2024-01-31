package class1;

import class2.JavaVariablesTest;

public class IdentifiersTesting  {
    int package2 = 25;
    int Age = 25;

    public void printAge() {
        System.out.println("Age is " + Age);
    }

    public static void main(String[] args) {
        IdentifiersTesting testing=new IdentifiersTesting();
        testing.printAge();
    }


}
