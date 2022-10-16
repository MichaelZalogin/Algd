package javaCourseOCA.L25;

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
        System.out.println("Teacher helps");
    }

    @Override
    void work() {
        System.out.println("Teacher works");
    }
}

class Driver extends Employee implements Help_able {

    @Override
    void work() {
        System.out.println("Driver works");
    }

    @Override
    public void help() {
        System.out.println("Driver helps");
    }
}

class Doctor extends Employee implements Help_able {

    @Override
    void work() {
        System.out.println("Doctor works");
    }

    @Override
    public void help() {
        System.out.println("Doctor helps");
    }
}

class Test1 {
    public static void main(String[] args) {
        Driver[] array1 = {new Driver(), new Driver()};
        Employee[] array2 = {new Driver(), new Driver(), new Teacher(), new Doctor()};
        Help_able[] array3 = {new Driver(), new Driver(), new Teacher(), new Doctor()};
        Employee emp1 = new Teacher();
        Employee emp2 = new Driver();
        Employee emp3 = new Doctor();
        emp1.work();
        emp2.work();
        emp3.work();
        Help_able h = new Teacher();
        Employee[] array4 = {emp1, emp2, emp3};
        System.out.println(emp1 instanceof Employee);
        System.out.println(emp1 instanceof Help_able);
        for (Employee emp : array4) {
            emp.work();
        }
    }
}

interface Help_able {
    void help();
}