package JavaCourseOCA.L25;

public class L25P2 {
    public static void main(String[] args) {
        Employee1 e1 = new Doctor1();
        Employee1 e2 = new Teacher1();
        Employee1 e3 = new Driver1();
        Doctor1 d1 = (Doctor1) e1;
        Employee1[] array1 = {e1, e2, e3};
        Employee1 e4 = new Employee1();
        for (Employee1 e : array1) {
            if (e instanceof Driver1) {
                System.out.println(((Driver1) e).car_name);
                ((Driver1) e).drive();
            }
        }
        System.out.println(d1.specializacia);
        System.out.println(((Doctor1) e1).specializacia);
        ((Doctor1) e1).heal();
    }
}

class Employee1 {
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

class Doctor1 extends Employee1 {
    String specializacia = "Hirurg";

    void heal() {
        System.out.println("Heal");
    }
}

class Teacher1 extends Employee1 implements Help_able1 {
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

class Driver1 extends Employee1 implements Help_able1, Swim_able1 {
    String car_name = "Mers";

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

interface Help_able1 {
    void resuscitation();

    void put_out_the_fire();
}

interface Swim_able1 {
    void swim();
}

class Casting {
    public static void main(String[] args) {
        String[] array2 = {"Privet", "Poka"};
        Object[] array3 = array2;
        String[] array4 = (String[]) array3;
    }
}