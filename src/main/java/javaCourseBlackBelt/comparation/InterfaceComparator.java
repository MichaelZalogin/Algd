package javaCourseBlackBelt.comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class InterfaceComparator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ivan");
        list.add("Petr");
        list.add("Vasiliy");
        Collections.sort(list);
        System.out.println(list);
        List<Employee2> list1 = new ArrayList<>();
        Employee2 emp1 = new Employee2(21, "Ivan", "Treg", 21243);
        Employee2 emp2 = new Employee2(15, "Pavel", "Petrov", 4334);
        Employee2 emp3 = new Employee2(123, "Victor", "Sidorov", 8142);
        list1.add(emp1);
        list1.add(emp2);
        list1.add(emp3);
        System.out.println("Before sort");
        System.out.println(list1);
        Collections.sort(list1, new IdComparator());
        Collections.sort(list1, new NameComparator());
        Collections.sort(list1, new SalaryComparator());
        System.out.println(list1);
    }
}

class Employee2 {
    int id;
    String name;
    String surname;
    int salary;

    public Employee2(int id, String name, String surname, int salary) {
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
}

class IdComparator implements Comparator<Employee2> {
    @Override
    public int compare(Employee2 emp1, Employee2 emp2) {
        if (emp1.id == emp2.id) {
            return 0;
        } else if (emp1.id < emp2.id) {
            return 1;
        } else {
            return -1;
        }
    }
}

class NameComparator implements Comparator<Employee2> {
    @Override
    public int compare(Employee2 emp1, Employee2 emp2) {
        return emp1.name.compareTo(emp2.name);
    }
}

class SalaryComparator implements Comparator<Employee2> {
    @Override
    public int compare(Employee2 emp1, Employee2 emp2) {
        return emp1.salary - emp2.salary;
    }
}