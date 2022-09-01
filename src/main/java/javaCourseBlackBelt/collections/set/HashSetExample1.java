package javaCourseBlackBelt.collections.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Michael");
        set.add("Oleg");
        set.add("Maryna");
        set.add("Igor");
        set.add("Igor");
//        set.add(null);
        System.out.println(set);
        set.remove("Michael");
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        set.contains("Michael");
        set.contains("Igor");
        for (String s : set) {
            System.out.println(s);
        }
    }
}