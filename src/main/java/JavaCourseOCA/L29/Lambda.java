package JavaCourseOCA.L29;

import java.util.ArrayList;
import java.util.Properties;

public class Lambda {
}

class Student2 {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    public Student2(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}


class StudentInfo1 {
    void printStudent(Student2 s1) {
        System.out.println("Имя студента: " + s1.name + ", пол " + s1.sex + ", возраст " + s1.age
                + ", курс " + s1.course + ", средняя оценка " + s1.avgGrade);
    }

    void testStudents(ArrayList<Student2> al, StudentChecks s1) {//Predicate <Student2>
        for (Student2 s : al) {
            if (s1.test(s)) {
                printStudent(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student2> studentArrayList = new ArrayList<>();
        Student2 st1 = new Student2("Ivan", 'm', 22, 3, 8.3);
        Student2 st2 = new Student2("Nikolay", 'm', 28, 2, 6.4);
        Student2 st3 = new Student2("Elena", 'f', 19, 1, 8.9);
        Student2 st4 = new Student2("Petr", 'm', 35, 4, 7.0);
        Student2 st5 = new Student2("Maria", 'f', 23, 3, 9.1);
        studentArrayList.add(st1);
        studentArrayList.add(st2);
        studentArrayList.add(st3);
        studentArrayList.add(st4);
        studentArrayList.add(st5);
        StudentInfo1 si = new StudentInfo1();

        si.testStudents(studentArrayList, (Student2 st) -> {
            return st.avgGrade > 8.5;
        });
        System.out.println("_____________________________________");
        si.testStudents(studentArrayList, (Student2 st) -> {
            return st.avgGrade < 8.5;
        });
        System.out.println("_____________________________________");
        si.testStudents(studentArrayList, (Student2 st) -> {
            return st.age > 25;
        });
        System.out.println("_____________________________________");
        si.testStudents(studentArrayList, (Student2 st) -> {
            return st.sex == 'm';
        });
        System.out.println("_____________________________________");
        si.testStudents(studentArrayList, st -> st.sex == 'm');
    }
}

interface StudentChecks {
    boolean test(Student2 s);
}