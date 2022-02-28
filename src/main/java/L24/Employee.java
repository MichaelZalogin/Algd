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

class Teacher extends Employee implements Help_able {
    int amount_student;

    void teach() {
        System.out.println("Teach");
    }

    @Override
    public void resuscitation() {
        System.out.println("A");
    }

    @Override
    public void put_out_the_fire() {
        System.out.println("B");
    }
}

class Driver extends Employee implements Help_able, Swim_able {
    String car_name;

    @Override
    public void resuscitation() {
        System.out.println("A");
    }

    @Override
    public void put_out_the_fire() {
        System.out.println("B");
    }

    @Override
    public void swim() {
        System.out.println("C");
    }

    void drive() {
        System.out.println("Drive");
    }
}

interface Help_able {
    void resuscitation();

    void put_out_the_fire();
}

interface Swim_able {
    void swim();
}