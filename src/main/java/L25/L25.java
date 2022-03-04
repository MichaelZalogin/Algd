package L25;

public class L25 {
}

abstract class Employee {

    void sleep() {
        System.out.println("Employee sleeps");
    }

    abstract void work();
}

class Teacher extends Employee implements Help_able {

    @Override
    public void help() {
        System.out.println("Help");
    }

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
        Employee epm1 = new Teacher();
        Employee epm2 = new Driver();
        Employee epm3 = new Doctor();
        epm1.work();
        epm2.work();
        epm3.work();
        Help_able h = new Teacher();
    }
}

interface Help_able {
    void help();
}