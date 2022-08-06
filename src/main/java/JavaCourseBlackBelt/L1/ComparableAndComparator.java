package JavaCourseBlackBelt.L1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableAndComparator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ivan");
        list.add("Petr");
        list.add("Vasiliy");
        Collections.sort(list);
        System.out.println(list);
        List<Employee3> list1 = new ArrayList<>();
        Employee3 emp1 = new Employee3(21, "Ivan", "Treg", 21243);
        Employee3 emp2 = new Employee3(15, "Pavel", "Petrov", 4334);
        Employee3 emp3 = new Employee3(123, "Victor", "Sidorov", 8142);
        list1.add(emp1);
        list1.add(emp2);
        list1.add(emp3);
        System.out.println("Before sort");
        System.out.println(list1);
        Collections.sort(list1);
        Collections.sort(list1, new NameComparator1());
        Collections.sort(list1, new SalaryComparator1());
        System.out.println(list1);
    }
}

class Employee3 implements Comparable<Employee3> {
    int id;
    String name;
    String surname;
    int salary;

    public Employee3(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee3 enotherEmp) {
        return this.id - enotherEmp.id;
    }
}

class NameComparator1 implements Comparator<Employee3> {
    @Override
    public int compare(Employee3 emp1, Employee3 emp2) {
        return emp1.name.compareTo(emp2.name);
    }
}

class SalaryComparator1 implements Comparator<Employee3> {
    @Override
    public int compare(Employee3 emp1, Employee3 emp2) {
        return emp1.salary - emp2.salary;
    }
}