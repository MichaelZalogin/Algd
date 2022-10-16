package javaCourseOCA.L4;
public class L4Homework{}

class Student {
    int ticketNumber;
    String name;
    String surname;
    int course;
    double math;
    double economic;
    double language;
}

class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.ticketNumber = 1;
        s1.name = "Petr";
        s1.surname = "Ivanov";
        s1.math = 3.4;
        s1.economic = 4.1;
        s1.language = 3.8;

        s2.ticketNumber = 2;
        s2.name = "Michael";
        s2.surname = "Petrov";
        s2.math = 3.6;
        s2.economic = 4.8;
        s2.language = 4.3;

        s3.ticketNumber = 3;
        s3.name = "Ivan";
        s3.surname = "Sidorov";
        s3.math = 4.4;
        s3.economic = 4.6;
        s3.language = 3.9;

        System.out.println("\nСредняя оценка студента: \n" + s1.name + " " + s1.surname + "\nсоставляет: "
                + (s1.economic + s1.math + s1.language)/3 + "\n");
        System.out.println("Средняя оценка студента: \n" + s2.name + " " + s2.surname + "\nсоставляет: "
                + (s2.economic + s2.math + s2.language)/3 + "\n");
        System.out.println("Средняя оценка студента: \n" + s3.name + " " + s3.surname + "\nсоставляет: "
                + (s3.economic + s3.math + s3.language)/3);
    }
}