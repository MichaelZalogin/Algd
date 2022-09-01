package javaCourseBlackBelt.collections.map;

import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<Double, Student> ht = new Hashtable<>();
        Student st1 = new Student("Ivan", "Petrov", 3);
        Student st2 = new Student("Marya", "Andreeva", 1);
        Student st3 = new Student("Sergey", "Sidorov", 4);
        Student st4 = new Student("Igor", "Ivanov", 3);
        ht.put(7.8, st1);
        ht.put(9.3, st2);
        ht.put(5.8, st3);
        ht.put(6.0, st4);
        ht.put(null, st4); // NullPointerException
        System.out.println(ht);
    }
}