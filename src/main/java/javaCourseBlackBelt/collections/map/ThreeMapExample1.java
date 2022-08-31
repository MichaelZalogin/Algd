package javaCourseBlackBelt.collections.map;

import java.util.TreeMap;

public class ThreeMapExample1 {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();
        Student st1 = new Student("Ivan", "Petrov", 3);
        Student st2 = new Student("Marya", "Andreeva", 1);
        Student st3 = new Student("Sergey", "Sidorov", 4);
        Student st4 = new Student("Igor", "Ivanov", 3);
        Student st5 = new Student("Vasiliy", "Kapustin", 1);
        Student st6 = new Student("Sasha", "Luhov", 4);
        Student st7 = new Student("Elena", "Avdeeeva", 3);
        Student st8 = new Student("Elena", "Avdeeeva", 3);
        treeMap.put(5.8, st1);
        treeMap.put(6.4, st2);
        treeMap.put(7.2, st3);
        treeMap.put(7.9, st4);
        treeMap.put(8.2, st5);
        treeMap.put(9.1, st6);
        treeMap.put(3.2, st7);
        treeMap.put(5.2, st8);
        System.out.println(treeMap);
        System.out.println(treeMap.descendingMap());
        System.out.println(treeMap.tailMap(7.3));
        System.out.println(treeMap.headMap(7.3));
        System.out.println(treeMap.lastEntry());
        System.out.println(treeMap.firstEntry());
    }
}