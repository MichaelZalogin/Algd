package L22;

public class L22P3 {
}

class Employee {
    String name;
    int age;
    int experience;

    void dinner() {
        System.out.println("Ужин");
    }

    void sleep() {
        System.out.println("Спать");
    }
}

class Doctor1 extends Employee {
    String specialization;

    void heal() {
        System.out.println("Лечить");
    }
}

class Teacher1 extends Employee {
    int amount_student;

    void teach() {
        System.out.println("Учить");
    }
}

class Driver1 extends Employee {
    String car_name;

    void drive() {
        System.out.println("Водить");
    }
}