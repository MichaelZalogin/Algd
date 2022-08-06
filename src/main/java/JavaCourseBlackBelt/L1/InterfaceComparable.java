package JavaCourseBlackBelt.L1;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class InterfaceComparable {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ivan");
        list.add("Petr");
        list.add("Vasiliy");
        Collections.sort(list);
        System.out.println(list);
        List<Employee1> list1 = new ArrayList<>();
        Employee1 emp1 = new Employee1(21, "Ivan", "Treg", 21243);
        Employee1 emp2 = new Employee1(15, "Pavel", "Petrov", 4334);
        Employee1 emp3 = new Employee1(123, "Victor", "Sidorov", 8142);
        list1.add(emp1);
        list1.add(emp2);
        list1.add(emp3);
        System.out.println("Before sort");
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);
    }
}

class Employee1 implements Comparable<Employee1> {
    int id;
    String name;
    String surname;
    int salary;

    public Employee1(int id, String name, String surname, int salary) {
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
    public int compareTo(Employee1 anotherEmp) {
        if (this.id > anotherEmp.id) {
            return 1;
        } else if (this.id == anotherEmp.id) {
            return 0;
        } else {
            return -1;
        }
        /** return this.id - anotherEmp.id;
         int res = this.name.compareTo(anotherEmp.name);
         if (res == 0) {
         res = this.name.compareTo(anotherEmp.name);
         }
         return res;
         */
    }
}