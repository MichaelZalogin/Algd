package javaCourseBlackBelt.collections.map;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Double, Student> lhm = new LinkedHashMap<>(16, 0.75f);
        Student st1 = new Student("Ivan", "Petrov", 3);
        Student st2 = new Student("Marya", "Andreeva", 1);
        Student st3 = new Student("Sergey", "Sidorov", 4);
        Student st4 = new Student("Igor", "Ivanov", 3);
        lhm.put(5.8, st1);
        lhm.put(6.4, st2);
        lhm.put(7.2, st3);
        lhm.put(7.9, st4);
        System.out.println(lhm);
    }
}
