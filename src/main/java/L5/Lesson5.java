package L5;

public class Lesson5 {
    int summa(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }
}

class Lesson5part2 {
    public static void main(String[] args) {
        Lesson5 type = new Lesson5();
        int summaTrexChisel = type.summa(1, 2, 3);
        System.out.println(summaTrexChisel);
    }
}

class Car {
    String color;
    String engine;
    int speed;

    int gaz(int a) {
        speed += a;
        return speed;
    }
        int tormoz ( int a) {
            speed -= a;
            return speed;
        }
    void showinfo() {
        System.out.println("cvet " + color + " motor: " + engine + " skorost " + speed);
    }
}class CarTest {
    public static void main(String[] args) {
        Car f = new Car();
        f.color = "white";
        f.engine = "V9";
        f.speed = 60;

        f.showinfo();
        f.gaz(20);
        f.showinfo();
        f.tormoz(80);
        f.showinfo();
    }
}
