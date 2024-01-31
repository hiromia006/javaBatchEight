package class3;

public class Employee {

    private int salary;
    public String name;
    protected String id;

    public String mobileNumber;

    public Employee() {

    }

    public Employee(int salary, String name, String id, String mobileNumber) {
        this.salary = salary;
        this.name = name;
        this.id = id;
        this.mobileNumber = mobileNumber;
    }

    public void printId() {
        System.out.println("Your id is " + id);
    }

    public void printId(String id) {
        System.out.println("Your id is " + id);
    }

    public String getMobileNumber() {
        return mobileNumber;
    }


    public static void main(String[] args) {

    }

}
