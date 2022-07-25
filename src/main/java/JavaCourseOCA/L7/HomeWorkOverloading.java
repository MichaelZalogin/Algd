package JavaCourseOCA.L7;

public class HomeWorkOverloading {

    int methodOverLoading() {
        int result = 0;
        System.out.println(result);
        return result;
    }

    int methodOverLoading(int a) {
        int result = a;
        System.out.println(result);
        return result;
    }

    int methodOverLoading(int a, int b) {
        int result = a + b;
        System.out.println(result);
        return result;
    }

    int methodOverLoading(int a, int b, int c) {
        int result = a + b + c;
        System.out.println(result);
        return result;
    }

    int methodOverLoading(int a, int b, int c, int d) {
        int result = a + b + c + d;
        System.out.println(result);
        return result;
    }
}

class HomeWorkOverLoadingTest {
    public static void main(String[] args) {
        HomeWorkOverloading RunMethod = new HomeWorkOverloading();
        RunMethod.methodOverLoading(3, 4, 5, 6);
    }
}

class Student25 {

    int numberStudyTicket;
    String name;
    String surname;
    int year;
    double mathematica;
    double economic;
    double english;

    Student25(int numberStudyTicket2, String name2, String surname2, int year2, double mathematica2, double economic2, double english2) {
        numberStudyTicket = numberStudyTicket2;
        name = name2;
        surname = surname2;
        year = year2;
        mathematica = mathematica2;
        economic = economic2;
        english = english2;
    }

    Student25(int numberStudyTicket3, String name3, String surname3, int year3) {
        this(numberStudyTicket3, name3, surname3, year3, 0.0, 0.0, 0.0);
    }

    Student25(String name4, String surname4, double mathematica4, double economic4, double english4) {
        this(0, name4, surname4, 0, mathematica4, economic4, english4);
    }

}

class Student25Test {
    public static void main(String[] args) {
        Student25 TestRun = new Student25(23, "Ivan", "Ivanov", 22);
        Student25 TestRun2 = new Student25("Ivan", "Ivanov", 3.4, 4.5, 4.6);
        Student25 TestRun3 = new Student25(23, "Ivan", "Ivanov", 22, 3.4, 4.5, 4.6);
    }
}

