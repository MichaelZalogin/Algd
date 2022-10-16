package javaCourseOCA.L4;

public class Student3 {
    public Student3(int year, String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public int numberStudyTicket;
    public String name;
    public String surname;
    public int year;
    public double mathematica;
    public double economic;
    public double english;
}

class StudentTest3 {
    public static void main(String[] args) {

        Student3 student1 = new Student3(23, "Ivan", "Petrov");
        Student3 student2 = new Student3(23, "Ivan", "Petrov");
        Student3 student3 = new Student3(23, "Ivan", "Petrov");

        student1.numberStudyTicket = 112344432;
        student1.name = "Ivan";
        student1.surname = "Ivanov";
        student1.year = 2013;
        student1.mathematica = 5.0;
        student1.economic = 4.3;
        student1.english = 3.2;

        student2.numberStudyTicket = 24321413;
        student2.name = "Petr";
        student2.surname = "Petrov";
        student2.year = 2015;
        student2.mathematica = 4.0;
        student2.economic = 5.3;
        student2.english = 3.7;

        student3.numberStudyTicket = 241131;
        student3.name = "Andrey";
        student3.surname = "Sogomonian";
        student3.year = 2019;
        student3.mathematica = 4.5;
        student3.economic = 4.2;
        student3.english = 4.0;

        System.out.println("Студент по имени и фамилии " +student1.name + " " +student1.surname + " " +
                "получил студенческий билет № " +student1.numberStudyTicket + ", закончил обучение в "
                +student1.year + " году со средней арифметической оценкой " +
                (student1.mathematica + student1.economic + student1.english)/3);

        System.out.println("Студент по имени и фамилии " +student2.name + " " +student2.surname + " " +
                "получил студенческий билет № " +student2.numberStudyTicket + ", закончил обучение в "
                +student2.year + " году со средней арифметической оценкой " +
                (student2.mathematica + student2.economic + student2.english)/3);

        System.out.println("Студент по имени и фамилии " +student3.name + " " +student3.surname + " " +
                "получил студенческий билет № " +student3.numberStudyTicket + ", закончил обучение в "
                +student3.year + " году со средней арифметической оценкой " +
                (student3.mathematica + student3.economic + student3.english)/3);
    }
}