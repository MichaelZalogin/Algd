package L6;

public class HomeworkL6 {

    void count() {
        System.out.println(0);
    }

    int count(int i1) {
        System.out.println(i1);
        return i1;
    }

    int count(int i1, int i2) {
        int result = count(i1) + i2;
        System.out.println(result);
        return result;
    }

    int count(int i1, int i2, int i3) {
        int result = count(i1, i2) + i3;
        System.out.println(result);
        return result;
    }

    int count(int i1, int i2, int i3, int i4) {
        int result = count(i1, i2, i3) + i4;
        System.out.println(result);
        return result;
    }

    int count(int i1, int i2, int i3, int i4, int i5) {
        int result = count(i1, i2, i3, i4) + i5;
        System.out.println(result);
        return result;
    }
}

class Student {
    int numberStudyTicket;
    String name;
    String surname;
    int year;
    double mathematica;
    double economic;
    double english;


    public Student(int numberStudyTicket, String name, String surname, int year, double mathematica, double economic, double english) {
        this.numberStudyTicket = numberStudyTicket;
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mathematica = mathematica;
        this.economic = economic;
        this.english = english;
    }
    Student (){};

    public Student(int numberStudyTicket, String name, String surname, int year) {
        this.numberStudyTicket = numberStudyTicket;
        this.name = name;
        this.surname = surname;
        this.year = year;
    }
}
class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Ivan", "Petrov", 4, 5.4, 3.5, 4.3);
        Student s2 = new Student(1, "Ivan", "Petrov", 4);
        Student s3 = new Student();
        HomeworkL6 h1 = new HomeworkL6();
        h1.count(2, 2, 3, 4, 5);
    }
}