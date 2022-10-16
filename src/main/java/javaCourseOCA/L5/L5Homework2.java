package javaCourseOCA.L5;
public class L5Homework2{}

class Student {
    int numberStudyTicket;
    String name;
    String surname;
    int year;
    double mathematica;
    double economic;
    double english;

    double srednArifm (Student s) {
       double srednOcenka = ((s.mathematica + s.economic + s.english)/3);
        System.out.println(srednOcenka);
        return srednOcenka;
    }
}
class StudentTest1 {
    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

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

        student1.srednArifm(student3);
        student1.srednArifm(student2);
        student1.srednArifm(student1);
    }
}
