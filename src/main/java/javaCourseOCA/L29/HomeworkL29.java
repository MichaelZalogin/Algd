package javaCourseOCA.L29;

import java.util.ArrayList;
import java.util.function.Predicate;

public class HomeworkL29 {
}

class Employee {
    String name;
    int department;
    double salary;

    public Employee(String name, int department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

class TestEmployee {
    public void printEmployee(Employee s) {
        System.out.println("Имя работника " + s.name + " Департамент " + s.department + " Зарплата " + s.salary);
    }

    public void filtraciyaRabotnikov(ArrayList<Employee> al, Predicate<Employee> p) {
        for (Employee emp : al) {
            if (p.test(emp)) {
                printEmployee(emp);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Employee> list1 = new ArrayList<>();
        Employee emp1 = new Employee("Ivan", 23, 300.0);
        Employee emp2 = new Employee("Petr", 12, 232.3);
        Employee emp3 = new Employee("Andrey", 1, 122.21);
        Employee emp4 = new Employee("Vladimir", 43, 543.3);
        Employee emp5 = new Employee("Vladislav", 11, 453.3);
        Employee emp6 = new Employee("Igor", 32, 543.23);
        list1.add(emp1);
        list1.add(emp2);
        list1.add(emp3);
        list1.add(emp4);
        list1.add(emp5);
        list1.add(emp6);
        TestEmployee e1 = new TestEmployee();
        e1.filtraciyaRabotnikov(list1, (Employee e12) -> {
            return e12.salary > 150.00;
        });
        e1.filtraciyaRabotnikov(list1, (Employee e12) -> {
            return e12.salary > 150.00 && e12.name.startsWith("V");
        });
        e1.filtraciyaRabotnikov(list1, (Employee e12) -> {
            return e12.salary > 150.00 && e12.name.startsWith("V") || e12.department == 43;
        });
    }
}