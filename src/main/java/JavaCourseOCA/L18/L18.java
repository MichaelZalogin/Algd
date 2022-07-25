package JavaCourseOCA.L18;

public class L18 {
    public void email(String s) {
        int a = 0;
        int b = 0;
        int c = 0;
        while (c < s.length() - 1) {
            a = s.indexOf('@', c);
            b = s.indexOf('.', c);
            c = s.indexOf(';', c + 1);
            System.out.println(s.substring(a + 1, b));
        }
    }

    public static void main(String[] args) {
        L18 obj = new L18();
        obj.email("ya@yahoo.com; on@mail.ru; ona@gmail.com;");
    }
}

class Lesson18 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Good Day!!!");
        StringBuilder sb3 = new StringBuilder(50);
        StringBuilder sb4 = new StringBuilder(sb2);

        System.out.println(sb2.length());// Длинна
        System.out.println(sb2.charAt(5));// Вывести чар с индексом
        System.out.println(sb2.indexOf("!", 4)); // найти индекс чара
        System.out.println(sb2.substring(3)); // начать с...
        System.out.println(sb2.substring(5, 8));// вывести с.. до..
        System.out.println(sb2.subSequence(5, 8));// аналогично сабстингу
        System.out.println(sb2.append(22));// добавить в массив
        System.out.println(sb2.append(true));
        System.out.println(sb2.append(sb2));
        System.out.println(sb2.append(new Car()));
        System.out.println(sb2.insert(4, 55)); // добавить с какого то символа
        System.out.println(sb2.insert(sb2.length(), true));
        System.out.println(sb2.delete(4, 8)); // удалить диапазон
        System.out.println(sb2.deleteCharAt(2)); // удалить чар
        System.out.println(sb2.reverse()); // перевернуть
        System.out.println(sb2.replace(0, 5, "Что то новое"));//замена
        System.out.println(sb2.capacity());
        System.out.println(sb1.capacity());
    }
}

class Car {
}