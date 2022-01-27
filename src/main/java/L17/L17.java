package L17;

import java.util.SortedMap;

public class L17 {

    public static void main(String[] args) {
        String s1 = new String("feewefffewrecewwedwe");

        System.out.println(s1.length()); //определяет длинну массива

        System.out.println(s1.charAt(3));//определяет чар по индексу

        System.out.println(s1.indexOf('c'));//определяет индекс чара
        System.out.println(s1.indexOf("et"));//определяет индекс стринга
        System.out.println(s1.indexOf("e", 5));//определяет индекс начиная не с нуля

        System.out.println(s1.startsWith("fee"));//возвращает булево значение, сравнивает начало
        System.out.println(s1.startsWith("f3dd"));//возвращает булево значение
        System.out.println(s1.startsWith("few", 7));//возвращает булево значение не с нулевого индекса
        System.out.println(s1.startsWith("few", 7));//возвращает булево значение не с нулевого индекса

        System.out.println(s1.endsWith("dwe"));//возвращает булево значение. Сравнение конца массива

        String s10 = s1.substring(3);// присваевает массив начиная с заданного индекса
        System.out.println(s10);
        String s11 = s1.substring(3, 7);// (последний индекс не присваевается)
        System.out.println(s11);
        String s12 = s1.substring(3, 20);// (последний элемент индекс 19)
        System.out.println(s12);

        String s13 = s1.trim();// убирает боковые пробелы
        System.out.println(s13);

        String s14 = s1.replace('f', 'y');// заменяет элемент
        System.out.println(s14);

        String s5 = "good ";
        String s6 = "afternoon";
        System.out.println(s5.concat(s6));// конкатенация

        String s15 = "R2VE32RrecfEVCX";
        String s16 = s15.toLowerCase();
        System.out.println(s16);// делает все символы маленькими

        String s17 = s1.toUpperCase();
        System.out.println(s17);// делает все символы большими

        boolean b = s1.contains(":2");
        System.out.println(b); // условие, содержит ли массив в себе символы





    }
}

class Employee {
    double salary;
    boolean isManager;

    Employee(double salary, boolean isManager) {
        this.salary = salary;
        this.isManager = isManager;
    }
}

class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee(100, true);
        System.out.println(emp.isManager + " " + emp.salary);
    }
}