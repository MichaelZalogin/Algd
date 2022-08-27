package javaCourseBlackBelt.collections.linkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExm1 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 3);
        Student st2 = new Student("Nikolay", 2);
        Student st3 = new Student("Elena", 1);
        Student st4 = new Student("Petr", 4);
        Student st5 = new Student("Marya", 3);
        List<Student> studentsLinkedList = new LinkedList<>();
        studentsLinkedList.add(st1);
        studentsLinkedList.add(st2);
        studentsLinkedList.add(st3);
        studentsLinkedList.add(st4);
        studentsLinkedList.add(st5);
        System.out.println("LinkedList = " + studentsLinkedList);
        System.out.println(studentsLinkedList.get(2));
        Student st6 = new Student("Zaur", 3);
        Student st7 = new Student("Igor", 4);
        studentsLinkedList.add(st6);
        System.out.println("LinkedList = " + studentsLinkedList);
        studentsLinkedList.add(1, st7);
        System.out.println("LinkedList = " + studentsLinkedList);
        studentsLinkedList.remove(3);
        System.out.println("LinkedList = " + studentsLinkedList);
    }
}

class Student {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public String getName() {
        return this.name;
    }

    public int getCourse() {
        return this.course;
    }
}