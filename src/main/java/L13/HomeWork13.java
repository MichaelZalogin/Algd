package L13;

import L12.Student;
import L14.Status;

public class HomeWork13 { // Сравнение reference data type

    public static void method1(Student s1, Student s2) { // метод общего сравения. If statement
        if (s1.name.equals(s2.name) && s1.course == s2.course && s1.history == s2.history) {
            System.out.println("Студенты одинаковые");
        } else {
            System.out.println("студенты не одинаковые");
        }
    }

    public static void method2(Student s1, Student s2) { // метод пошагового сравнения. Nested if statement
        if (s1.name.equals(s2.name)) {
            if (s1.course == s2.course) {
                if (s1.history == s2.history) {
                    if (s1.surname.equals(s2.surname)) {
                        System.out.println("Студенты одинаковые");
                    } else {
                        System.out.println("У студентов разные фамилии");
                    }
                } else {
                    System.out.println("У студентов разные оценки");
                }
            } else {
                System.out.println("Студенты на разных курсах");
            }
        } else {
            System.out.println("У студентов разные имена");

        }
    }

    public static void main(String[] args) {
        Student st3 = new Student(1, 2, "Ivan", "Ivanov", 3.4);
        Student st4 = new Student(2, 4, "Ivan", "Petrov", 3.2);
        Student st5 = new Student(3, 5, "Ivan", "Ufimov", 3.7);
        Student st6 = new Student(3, 5, "Ivan", "Ufimov", 3.7);
        method1(st3, st4);
        method2(st3, st4);
        method2(st3, st5);
        method1(st3, st4);
        method1(st5, st6);
    }
}

class Student1 { // Сравнение if и switch selected.
    int grade;

    Student1(int grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student1 st5 = new Student1(3);
        if (st5.grade == 2) {
            System.out.println(Status.BAD); // enum Status
        } else if (st5.grade == 3) {
            System.out.println("Студент троечник");
        } else if (st5.grade == 4) {
            System.out.println(Status.GOOD); // enum Status
        } else if (st5.grade == 5) {
            System.out.println("Студент отличник");
        } else {
            System.out.println("Введена неверная оценка");
        }
        Student1 st6 = new Student1(2);

        switch (st6.grade) {
            case 2:
                System.out.println(Status.BAD);  // enum Status
                break;
            case 3:
                System.out.println("Студент троечник");
                break;
            case 4:
                System.out.println(Status.GOOD);  // enum Status
                break;
            case 5:
                System.out.println("Студент отличник");
                break;
            default:
                System.out.println("Оценка не верна");
        }
    }
}

class Employee {
    public static void main(String[] args) {
        switch ("Понедельник") {
            case "Поннедельник":
            case "Вторник":
            case "Среда":
            case "Четверг":
            case "Пятница":
                System.out.println("Работа до 20:00");
                break;
            case "Суббота":
            case "Воскресенье":

                System.out.println("Выходной");
                break;
            default:
                System.out.println("Неверный день недели");
        }
    }
}

class Month {
    public static void month_method(int a) {
        switch (a) {
            case 2:
                System.out.println("28 дней");
                break;
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("31 день");
                break;
            case 4, 6, 9, 11:
                System.out.println("30 дней");
                break;
            default:
                System.out.println("Неверный месяц");
        }
    }

    public static void main(String[] args) {
        month_method(12);
    }
}
