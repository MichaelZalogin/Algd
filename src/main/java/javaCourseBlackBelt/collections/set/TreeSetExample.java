package javaCourseBlackBelt.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(8);
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(10);
        System.out.println(treeSet);
        treeSet.remove(2);
        System.out.println(treeSet);
        System.out.println(treeSet.contains(1));
        System.out.println(treeSet.contains(2));
        TreeSet<Student> treeSet1 = new TreeSet<>();
        Student st1 = new Student("Ivan", 3);
        Student st2 = new Student("Marya", 2);
        Student st3 = new Student("Sergey", 1);
        Student st4 = new Student("Andrey", 4);
        Student st5 = new Student("Victor", 5);
        treeSet1.add(st1);
        treeSet1.add(st2);
        treeSet1.add(st3);
        treeSet1.add(st4);
        treeSet1.add(st5);
        System.out.println(treeSet1);
        System.out.println(treeSet1.first());
        System.out.println(treeSet1.last());
        Student st6 = new Student("Kocty", 3);
        Student st7 = new Student("Kocty", 1);
        System.out.println(treeSet1.headSet(st6));
        System.out.println(treeSet1.tailSet(st6));
        System.out.println(treeSet1.subSet(st7, st6));
    }
}

class Student implements Comparable<Student> {
    String name;
    int course;

    @Override
    public int compareTo(Student o) {
        return this.course - o.course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }
}