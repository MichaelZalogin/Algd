package javaCourseOCA.L5;

public class L5Homework3 {
}

class Employee {

    int id;
    String name;
    String surname;
    int age;
    double salary;
    String department;

    Employee(int id, String name, String surname, int age, double salary, String department) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    double uvelichenieZarplaty(double mnozhitel) {
        salary *= mnozhitel;
        return salary;
    }

    void info() {
        System.out.println("Зарплата работника " + name + " " + surname + " составляет " + salary);
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Ivan", "Petrov", 23, 150.5, "Developer");
        Employee emp2 = new Employee(2, "Pert", "Ivanov", 25, 143.5, "Developer");
        emp1.uvelichenieZarplaty(2);
        emp2.uvelichenieZarplaty(2);
        emp1.info();
        emp2.info();
    }
}