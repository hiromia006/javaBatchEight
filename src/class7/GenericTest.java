package class7;

import class8.GenericNumber;

public class GenericTest {
    public static void main(String[] args) {
        IntegerTest integerTest = new IntegerTest(987);
        System.out.println(integerTest.getInteger());

        StringTest stringTest = new StringTest("SQA Learning");
        System.out.println(stringTest.getString());

        DoubleTest doubleTest = new DoubleTest(987.25);
        System.out.println(doubleTest.getaDouble());

        LongTest longTest = new LongTest(35474l);
        System.out.println(longTest.getaLong());

        System.out.println("================================================");
        Generic<Integer> integerGeneric = new Generic<>(258);
        System.out.println(integerGeneric.getObj());

        Generic<String> stringGeneric = new Generic<>("SQA");
        System.out.println(stringGeneric.getObj());

        Generic<Double> doubleGeneric = new Generic<>(654.25);
        System.out.println(doubleGeneric.getObj());
        System.out.println("================================================");

        GenericNumber<Long> genericNumber = new GenericNumber<>(654l);
        System.out.println(genericNumber.getObj());
    }
}
