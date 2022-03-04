package L25;

public class L25 {
}

abstract class Employee {

    void sleep() {
        System.out.println("Employee sleeps");
    }

    abstract void work();
}

class Teacher extends Employee {

    @Override
    void work() {
        System.out.println("Teacher works");
    }
}

class Driver extends Employee {

    @Override
    void work() {
        System.out.println("Driver works");
    }
}

class Doctor extends Employee {

    @Override
    void work() {
        System.out.println("Doctor works");
    }
}

class Test1 {
    public static void main(String[] args) {

    }
}