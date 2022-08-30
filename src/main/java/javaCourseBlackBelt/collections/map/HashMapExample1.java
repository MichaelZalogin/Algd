package javaCourseBlackBelt.collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Michael");
        map1.put(3568, "Ivan");
        map1.put(6578, "Maria");
        map1.put(1576, "Petr");
        map1.put(132176, "Petr");
        map1.putIfAbsent(1000, "Vasily");
        System.out.println(map1);
        System.out.println(map1.get(1000));
        System.out.println(map1.get(1001));
        map1.remove(1576);
        System.out.println(map1);
        System.out.println(map1.containsValue("Maria"));
        System.out.println(map1.containsKey(500));
        System.out.println(map1.keySet());
        System.out.println(map1.values());
        Map<String, String> map2 = new HashMap<>();
        map2.put("Black", "Petr");
        map2.put("White", "Andrey");
        System.out.println(map2);
    }
}