package JavaCourseOCA.L23;

public class OverridingHidingFinal {
    public static void main(String[] args) {
        Employee2 e1 = new Employee2();
        Doctor2 d1 = new Doctor2();
        Teacher2 t2 = new Teacher2();
        Driver2 dr2 = new Driver2();
        Employee2 e2 = new Doctor2();
        Employee2 e3 = new Teacher2();
        Employee2 e4 = new Driver2();
        t2.eat();
        e3.eat();
        Aspirant a1 = new Aspirant();
        a1.eat();
        Employee2 e5 = new Aspirant();
        e5.eat();
    }
}

class Employee2 {
    double salary;
    String name;
    int age;
    int experience;

    void eat() {
        System.out.println("Eating");
    }

    void sleep() {
        System.out.println("Sleeping");
    }
}

class Doctor2 extends Employee2 {

}

class Teacher2 extends Employee2 {
    int countStudents;

    void teach() {
        System.out.println("Teaching");
    }

    void eat() {
        System.out.println("Teacher eating");
    }
}

class Driver2 extends Employee2 {
}

class Aspirant extends Teacher2 {
}