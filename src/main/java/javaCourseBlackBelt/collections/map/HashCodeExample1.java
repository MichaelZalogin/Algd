package javaCourseBlackBelt.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeExample1 {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Ivan", "Petrov", 3);
        Student st2 = new Student("Marya", "Andreeva", 1);
        Student st3 = new Student("Sergey", "Sidorov", 4);
        map.put(st1, 7.5);
        map.put(st2, 8.7);
        map.put(st3, 9.2);
        System.out.println(map);
        Student st4 = new Student("Marya", "Andreeva", 1);
        boolean result = map.containsKey(st4);
        System.out.println(result);
        System.out.println(st1.hashCode());
        Student st5 = new Student("Igor", "Voronov", 4);
    }
}

final class Student {
    final private String NAME;
    final private String SURNAME;
    final private int COURSE;

    public Student(String NAME, String SURNAME, int COURSE) {
        this.NAME = NAME;
        this.SURNAME = SURNAME;
        this.COURSE = COURSE;
    }

    public String getNAME() {
        return this.NAME;
    }

    public String getSURNAME() {
        return this.SURNAME;
    }

    public int getCOURSE() {
        return this.COURSE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return COURSE == student.COURSE && Objects.equals(NAME, student.NAME) && Objects.equals(SURNAME, student.SURNAME);
    }

    @Override
    public int hashCode() {
        return Objects.hash(NAME, SURNAME, COURSE);
    }

    @Override
    public String toString() {
        return "Student{" +
                "NAME='" + NAME + '\'' +
                ", SURNAME='" + SURNAME + '\'' +
                ", COURSE=" + COURSE +
                '}';
    }
}