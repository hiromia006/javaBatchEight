package class8;

import java.util.HashMap;
import java.util.Map;

public class MapTest2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("lastname", "lastname1");
        map.put("lastname", "lastname2");
        System.out.println(map.get("lastname"));

        Map<String, Map> map2 = new HashMap<>();
        map2.put("author", map);
    }
}
