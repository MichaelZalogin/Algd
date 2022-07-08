package L22;

import javax.print.Doc;

public class Inheritance {
}

class Employee2 {
    String name;
    int age;

    void up (Employee2 s) {
    s.age = s.age + 100;
    }

    void eat() {
        System.out.println("Кушать");
    }
}

class Doctor2 extends Employee2 {

    void heal() {
        System.out.println("Лечить");
    }
}

class Teacher2 extends Employee2 {

    void teach() {
        System.out.println("Учить");
    }
}