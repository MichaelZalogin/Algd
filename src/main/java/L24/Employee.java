package L24;

public class Employee {
    double salary = 100;
    String name;
    int age;
    int experience;

    void eat() {
        System.out.println("Eat");
    }

    void sleep() {
        System.out.println("Sleep");
    }
}

class Doctor extends Employee {
    void heal() {
        System.out.println("Heal");
    }
}

class Surgeon extends Doctor {
    String scalpel;

    void operation() {
    }
}

class Dentist extends Doctor {

}
