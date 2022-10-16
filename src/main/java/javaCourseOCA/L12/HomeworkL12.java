package javaCourseOCA.L12;

import javaCourseOCA.L4.*;

public class HomeworkL12 {
}

class StudentTest {

    public void compareReferences(Student3 s1, Student3 s2) {
        if (s1.name.equals(s2) && s1.surname.equals(s2.surname) && s1.numberStudyTicket == s1.numberStudyTicket) {
            System.out.println("Студенты одинаковые");
        } else {
            System.out.println("Студенты не одинаковые");
        }
    }

    public void compareAttributes(Student3 s1, Student3 s2) {
        if (s1.numberStudyTicket == s2.numberStudyTicket) {
            if (s1.name.equals(s2.name)) {
                if (s1.surname.equals(s2.surname)) {
                    System.out.println("Параметры студентов совпадают");
                } else {
                    System.out.println("Имена и фамилии у студентов равны, а номера студенческого билета не равны");
                }
            } else {
                System.out.println("Имена и номера студенческого билета совпадают, а фамилии не равны");
            }
        } else {
            System.out.println("Номера билетов различаются");
        }
    }

    public static void main(String[] args) {
        Student3 s1 = new Student3(23, "Ivan", "Petrov");
        Student3 s2 = new Student3(21, "Ivan", "Ivanov");
        new StudentTest().compareReferences(s1, s2);
        new StudentTest().compareAttributes(s2, s1);
    }
}