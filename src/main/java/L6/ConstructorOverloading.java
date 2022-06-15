package L6;

public class ConstructorOverloading {
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

    Employee(int id, String name, String surname, int age, double salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }

    Employee(int id, String surname, int age) {
        this.id = id;
        this.surname = surname;
        this.age = age;
    }

    Employee() {
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Ivanov", 3);
        Employee emp2 = new Employee();
        Employee emp3 = new Employee(1, "Petr", "Ivanov", 3, 43.4, "Developer");
    }
}