package class8;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "John");
        map.put("age", 30);
        map.put("age", 30);
        map.put("car", null);
        System.out.println(map.get("age"));
        map.put("Time", 10);
        map.remove("car");

        Map<String, Map> map2 = new HashMap<>();




    }
}
