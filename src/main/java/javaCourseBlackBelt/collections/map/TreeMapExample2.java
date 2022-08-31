package javaCourseBlackBelt.collections.map;

import java.util.TreeMap;

public class TreeMapExample2 {
    public static void main(String[] args) {
        TreeMap<Student, Double> treeMap = new TreeMap<>();
        Student st1 = new Student("Ivan", "Petrov", 3);
        Student st2 = new Student("Marya", "Andreeva", 1);
        Student st3 = new Student("Sergey", "Sidorov", 4);
        Student st4 = new Student("Igor", "Ivanov", 3);
        Student st5 = new Student("Vasiliy", "Kapustin", 1);
        Student st6 = new Student("Sasha", "Luhov", 4);
        Student st7 = new Student("Elena", "Avdeeeva", 3);
        Student st8 = new Student("Elena", "Avdeeeva", 3);
        treeMap.put(st1, 5.8);
        treeMap.put(st2, 6.4);
        treeMap.put(st3, 7.2);
        treeMap.put(st4, 7.9);
        treeMap.put(st5, 8.2);
        treeMap.put(st6, 9.1);
        treeMap.put(st7, 3.2);
        treeMap.put(st8, 5.2);
        System.out.println(treeMap);
    }
}