package javaCourseOCA.L8;

public class HomeworkL8 {

    static final double pi = 3.14;

    public static int umnozhenie(int a, int b, int c) {
        return a * b * c;
    }

    public static void delenie(int a, int b) {
        System.out.println("целая часть от деления: " + a / b + " и остаток:" + a % b);
    }

    public double ploshadKruga(double radius) {
        double ploshad = radius * radius * pi;
        System.out.println(ploshad);
        return ploshad;
    }

    public static double dlinaDugi(double radius) {
        double dlinaDugi = 2 * radius * pi;
        return dlinaDugi;
    }

    public void info(double radius) {
        System.out.println("Радиус круга: " + radius + "\n" + "Площадь круга: " + ploshadKruga(radius) + "\n" + "Длина дуги: " + dlinaDugi(radius));
    }
}

class TestHw {
    public static void main(String[] args) {
        HomeworkL8.umnozhenie(3, 4, 5);
        HomeworkL8.umnozhenie(6, 7, 8);
        HomeworkL8.delenie(8, 5);
        HomeworkL8.delenie(10, 5);
        HomeworkL8 h1 = new HomeworkL8();
        h1.delenie(3, 1);
        h1.umnozhenie(3, 1, 3);
        h1.ploshadKruga(12);
        HomeworkL8.dlinaDugi(5);
        h1.info(6);
    }
}