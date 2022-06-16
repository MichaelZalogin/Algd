package L7;

public class HomeworkL7 {
}

class Employee {
    private double salary;
    public String surname;
    int id;

    Employee(double salary, String surname, int id) {
        this.salary = salary;
        this.surname = surname;
        this.id = id;
    }

    public Employee(String surname, int id) {
        this.surname = surname;
        this.id = id;
    }

    private Employee(double salary) {
        this.salary = salary;

    }

    private void showSalary(Employee emp) {
        System.out.println(emp.salary);
    }

    public void showSurname(Employee emp) {
        System.out.println(emp.surname);
    }

    void showId(Employee emp) {
        System.out.println(emp.id);
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ivanov", 32);
        System.out.println(emp1.surname);
    }
}