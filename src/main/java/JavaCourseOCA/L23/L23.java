package JavaCourseOCA.L23;

public class L23 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.eat();
        Employee e1 = new Employee();
        e1.eat();
        Employee e2 = new Teacher();
        e2.eat();
    }
}

class Employee {

    double salary;
    String name;
    int age;
    int experience;

    Fruits eat() {
        System.out.println("Работник ест");
        Fruits f1 = new Fruits();
        return f1;
    }

    void sleep() {
        System.out.println("Работник спит");
    }
}

class Fruits {
}

class Apple extends Fruits {
}

class Teacher extends Employee {

    int amount_student;

    @Override
    Apple eat() {
        System.out.println("Учитель ест");
        Apple a1 = new Apple();
        return a1;
    }


    void teach() {
        System.out.println("Учить");
    }
}