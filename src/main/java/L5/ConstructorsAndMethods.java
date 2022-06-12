package L5;

import L4.Car;

public class ConstructorsAndMethods {
}

class Test20 {
    Test20() {
    }

    int summa(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }

    int sredneeArifm(int a1, int b1, int c1) {
        int result2 = summa(a1, b1, c1) / 3;
        return result2;
    }

    public static void main(String[] args) {
        Test20 t1 = new Test20();
        int d = t1.summa(4, 5, 6);
        System.out.println(d);
        System.out.println(t1.summa(5, 10, 15));
        System.out.println("Средняя арифметическая : " + t1.sredneeArifm(3, 4, 5));
    }
}

class Car5 {
    Car5() {
    }

    String color;
    String engine;
    int speed;

    int gaz(int skorost) {
        speed += skorost;
        return speed;
    }

    int tormoz(int skorost) {
        speed -= skorost;
        return speed;
    }

    void info() {
        System.out.println(speed);
        System.out.println(color);
        System.out.println(engine);
    }

    public static void main(String[] args) {
        Car5 c1 = new Car5();
        c1.speed = 10;
        c1.color = "Black";
        c1.engine = "v8";
        c1.gaz(40);
        c1.info();
        c1.tormoz(30);
        c1.info();
    }
}

class Car6 {
    Car6(String color, String engine) {
        this.color = color;
        this.engine = engine;
        System.out.println("Object is created");
    }

    String color;
    String engine;
    int speed;

    public static void main(String[] args) {
        Car6 c6 = new Car6("black", "v8");
        System.out.println(c6.color);
        System.out.println(c6.engine);
    }
}