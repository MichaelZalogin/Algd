package JavaCourseOCA.L11;

public class Employee {
    public String name;
    public double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double uvelichitel(double a) { //В данном случае метод возвращает значение
        return a = a * 2;
    }

    public double zp2() { //В данном случае метод возвращает саму зарплату
        this.salary *= 2;
        return this.salary;
    }
}

class EmpoyeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ivan", 100.55);
        double d = emp1.uvelichitel(emp1.salary);
        System.out.println(d);
        System.out.println(emp1.salary);
        emp1.zp2();
        System.out.println(emp1.salary);
        Student st1 = new Student("Ivan", 3, 9.5);
        Student st2 = new Student("Petr", 1, 5.3);
        Student.swapStudent(st1, st2);
        System.out.println(st1.name);
        System.out.println(st2.name);
        Student.changeName(st2);
        System.out.println(st2.name);
    }
}

class Student {
    String name;
    int course;
    double grade;

    public Student(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public static void swapStudent(Student s1, Student s2) { // Передается копия ссылки
        Student s3 = s1;
        s1 = s2;
        s2 = s3;
        System.out.println(s1.name);
    }

    public static void changeName (Student s1){
        s1.name = "Vasiliy";
    }
}