package javaCourseBlackBelt.collections.queue;

import java.util.Objects;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(4);
        priorityQueue.add(1);
        priorityQueue.add(10);
        priorityQueue.add(8);
        priorityQueue.add(9);
        priorityQueue.add(12);
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.remove());
        PriorityQueue<Student> priorityQueue1 = new PriorityQueue<>();
        Student st1 = new Student("Ivan", 3);
        Student st2 = new Student("Marya", 2);
        Student st3 = new Student("Sergey", 1);
        Student st4 = new Student("Andrey", 4);
        Student st5 = new Student("Victor", 5);
        priorityQueue1.add(st1);
        priorityQueue1.add(st2);
        priorityQueue1.add(st3);
        priorityQueue1.add(st4);
        priorityQueue1.add(st5);
        System.out.println(priorityQueue1);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }
}