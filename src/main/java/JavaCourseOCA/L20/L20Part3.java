package JavaCourseOCA.L20;

import java.util.*;

public class L20Part3 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        String s1 = "one";
        String s2 = "two";
        String s3 = "three";
        String s4 = "four";
        String s5 = "five";
        list1.add(s1);
        list1.add(s2);
        list1.add(s3);
        list1.add(s4);
        list1.add(s5);
        System.out.println("List1 = " + list1);
        List<String> list2 = List.of("odin", "dva", "tri");
        System.out.println("List2 = " + list2);
//        list2.add("Dff");//Exception
        List<String> list3 = List.copyOf(list1);
        System.out.println("List3 = " + list3);
    }
}

class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(777, "Sidorov D");
        map1.put(666, "Andrey S");
        map1.put(123, "Ivan M");
        map1.put(747, "Petr A");
        map1.put(744, "Petr A");
        map1.remove(123);
        System.out.println("map = " + map1);
    }
}