package javaCourseBlackBelt.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class StudentInfo {

    void testStudents(List<Student> a1, StudentChecks sc) {
        for (Student s : a1) {
            if (sc.check(s)) {
                System.out.println(s);
            }
        }
    }

    void testStudents2(List<Student> a1, Predicate<Student> sc1) {
        for (Student s : a1) {
            if (sc1.test(s)) {
                System.out.println(s);
            }
        }
    }

    void printStudentOverGrage(List<Student> a1, double grade) {
        for (Student student : a1) {
            if (student.avgGrade > grade) {
                System.out.println(student);
            }
        }
    }

    void printStudentUnderAge(List<Student> a1, int age) {
        for (Student student : a1) {
            if (student.age > age) {
                System.out.println(student);
            }
        }
    }

    void printStudentsOverMixConditions(List<Student> a1, int age, double grade, char sex) {
        for (Student student : a1) {
            if (student.age > age && student.avgGrade < grade && student.sex == sex) {
                System.out.println(student);
            }
        }
    }
}

class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Marya", 'f', 23, 3, 9.1);
        List<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);


        StudentInfo studentInfo = new StudentInfo();

        Collections.sort(studentList, (s1, s2) -> s2.name.compareTo(s1.name));

        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.name.compareTo(s2.name);
            }
        });

        studentInfo.printStudentOverGrage(studentList, 8);
        System.out.println("=============================================================");
        studentInfo.printStudentsOverMixConditions(studentList, 20, 8.5, 'm');
        System.out.println("=============================================================");
        studentInfo.printStudentUnderAge(studentList, 30);
        System.out.println("=============================================================");
        CheckOverGrade checkOverGrade = new CheckOverGrade();
        studentInfo.testStudents(studentList, checkOverGrade);
        System.out.println("=============================================================");
        studentInfo.testStudents(studentList, new StudentChecks() {
            @Override
            public boolean check(Student s) {
                return s.avgGrade > 8;
            }
        });
        System.out.println("=============================================================");
        studentInfo.testStudents(studentList, (Student s) -> {
            return s.avgGrade > 8;
        });
        System.out.println("=============================================================");
        studentInfo.testStudents(studentList, s -> s.avgGrade > 5);
        System.out.println("=============================================================");

        StudentChecks sc = s -> s.avgGrade > 6;
        studentInfo.testStudents(studentList, sc);
        System.out.println("=============================================================");

        Predicate<Student> stp1 = p -> p.avgGrade > 6 && p.sex == 'm';
        Predicate<Student> stp2 = p -> p.age > 20 && p.sex == 'f';

        studentInfo.testStudents2(studentList, stp1);
        studentInfo.testStudents2(studentList, stp2);
        studentInfo.testStudents2(studentList, stp2.and(stp1));
        studentInfo.testStudents2(studentList, stp2.and(stp1));
        studentInfo.testStudents2(studentList, stp2.negate());
    }
}

class CheckOverGrade implements StudentChecks {
    @Override
    public boolean check(Student s) {
        return s.avgGrade > 8;
    }
}