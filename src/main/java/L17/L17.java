package L17;

import java.sql.SQLOutput;
import java.util.Locale;
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

class NewTest {
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "Hello Mister";
        String s3 = s1.concat(s2).trim().replace("llo", "ll").substring(1, 8);// method chain
        System.out.println(s1.substring(s1.indexOf('l'), s1.indexOf('r')));
        String s4 = "Чтоб мудро жизнь прожить, знать надобно немало, Два важных правила запомни для начала: Ты " +
                "лучше голодай, чем что попало есть, И лучше будь один, чем вместе с кем попало.";
        String s5 = s4.toUpperCase();
        char c1;
        char c2;
        for (int i = 0; i < s4.length(); i++) {
            c1 = s4.charAt(i);
            c2 = s5.charAt(i);
            if (c1 != ',' && c1 != '.' && c1 != ' ' && c1 != '.' && c1 != ':' && c1 == c2) {
                System.out.println();
                System.out.print(c1);
                continue;
            }
            System.out.print(c1);
        }
        String s6 = new String("Hello World");
        String s7 = new String("Hello Mister");
        System.out.println();
        System.out.println(s6.substring(0, 5).equals(s7.substring(0, 5)));
        String s8 = "AbcdefQ";
        String s9 = "abcdefq";
        System.out.println(s8.equalsIgnoreCase(s9));
    }
}