package L10;

public class L10Homework {
}

class Employee {
    public String name;
    public double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double uvelichitel(double a) {
        a *= 2;
        return a;
    }

    public double zp2() {
        salary = salary * 2;
        return salary;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ivan", 100.55);
        double d = emp1.uvelichitel(emp1.salary);
        System.out.println(d);
        System.out.println(emp1.salary); //salary not change. Change variable a.
        emp1.zp2();
        System.out.println(emp1.salary);
    }
}

class Student {
    String name;
    int course;
    double grade;

    Student(String name, int course, double grade) {
        this.course = course;
        this.name = name;
        this.grade = grade;
    }

    public static void swap(Student s1, Student s2) {
        Student s3 = s1;
        s1 = s2;
        s2 = s3;
    }

    public static void change_name(Student s1) {
        s1.name = "Vasiliy";
    }

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 3, 9.5);
        Student st2 = new Student("Petr", 1, 5.3);
        Student.change_name(st2);
        System.out.println(st2.name);
    }
}

class Car {
    String color, engine;
    int count_door;

    Car(String color, String engine, int count_door) {
        this.color = color;
        this.count_door = count_door;
        this.engine = engine;
    }
}
class CarTest {
    public static void door (Car c1, int a){
        c1.count_door = a;
    }
    public static void swap_color (Car c1, Car c2){
        Car c3 = new Car("Blue","V3",4);
        c3.color = c1.color;
        c1.color = c2.color;
        c2.color = c3.color;
    }

    public static void main(String[] args) {
        Car c1 = new Car("Red","V3",3);
        Car c2 = new Car("Pink","V4",2);
        door(c1, 6);
        swap_color(c1,c2);
        System.out.println(c1.count_door);
        System.out.println(c2.color);
        System.out.println(c1.color);
    }
}
