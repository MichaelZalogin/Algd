package javaCourseBlackBelt.collections.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Employee implements Comparable<Employee> {
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        return this.name.compareTo(anotherEmp.name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && salary == employee.salary && Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname);
    }
}

public class ArrayListMethods2 {
    public static void main(String[] args) {
        List<Employee> list1 = new ArrayList<>();
        Employee emp1 = new Employee(21, "Ivan", "Treg", 21243);
        Employee emp2 = new Employee(15, "Pavel", "Petrov", 4334);
        Employee emp3 = new Employee(123, "Victor", "Sidorov", 8142);
        Employee emp4 = new Employee(321, "Nikolay", "Ivanov", 3232);
        list1.add(emp1);
        list1.add(emp2);
        list1.add(emp3);
        list1.add(emp4);
        System.out.println(list1);
        Employee emp5 = new Employee(321, "Nikolay", "Ivanov", 3232);
        list1.remove(emp5);
        System.out.println(list1);
    }
}