package L22;

public class Human {

    Human(String n) {
        this(n, null);
    }

    Human(String n, String s) {
        name = n;
        surname = s;
    }

    String name;
    String surname;

}

class Student2 extends Human {
    Student2() {
        super("Petr");
    }

    public static void main(String[] args) {
        Student2 s2 = new Student2();
        System.out.println(s2.name);
    }
}