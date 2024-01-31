package class8;

import java.util.*;

public class ListTest {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        marks.add(80);//0
        marks.add(85);//1
        marks.add(80);//2
        marks.add(70);//3
        marks.add(60);//4

        System.out.println(marks.get(0));
        marks.remove(0);//85,80,70,60
        marks.add(0, 99);//99, 85,70,60
        marks.add(75);

        List<Integer> list = Arrays.asList(95, 87, 86);
        marks.addAll(1, list);


        marks.removeAll(list);
        System.out.println("=======================");
        for (Integer integer : marks) {
            System.out.println(integer);
        }

        Set<Integer> marks2 = new HashSet<>();
        marks2.add(80);
        marks2.add(85);
        marks2.add(80);
        marks2.add(70);
        marks2.add(60);
        marks.addAll(marks2);


    }
}
