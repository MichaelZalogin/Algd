package JavaCourseOCA.L27;

public class Exceptions2 extends Exception {
    public Exceptions2() {
    }

    Exceptions2(String message) {
        super(message);
    }
}

class Exceptions3 extends RuntimeException {
    public Exceptions3() {
    }

    Exceptions3(String message) {
        super(message);
    }
}

class ExceptionsTest {

    public static void dostup(int login, int pass) throws Exceptions2 {
        if (login < 12) {
            throw new Exceptions2("папа 12 папа");
        }
        if (pass < 6) {
            throw new Exceptions3("Пас должен быть более 6 символов");
        }
    }

    public static void main(String[] args) throws Exceptions2 {
//    dostup(2,3);
        System.out.println("на русском");
    }
}