package class8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<Integer> marks = new HashSet<>();
        marks.add(80);
        marks.add(85);
        marks.add(80);
        marks.add(70);
        marks.add(60);

        System.out.println(marks.add(10));


        marks.remove(80);


        List<Integer> list = Arrays.asList(95, 87, 86);
        marks.addAll(list);

        System.out.println("=======================");
        for (Integer integer : marks) {
            System.out.println(integer);
        }
    }
}
