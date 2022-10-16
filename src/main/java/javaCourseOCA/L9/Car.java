package javaCourseOCA.L9;

public class Car {
    String color;
    String engine;
    public static int count;

    public Car(String color, String engine) {
        count++;
        this.color = color;
        this.engine = engine;
    }

    public static void changeA(int b) {
        Car c1 = new Car("Red", "V8");
        c1.engine = "V10"; //только после создания объекта можно определить переменную объекта в статичном методе.
    }

    public void showColor() {
        System.out.println("Цвет машины: " + color);
    }

    public void change_color(String color) {
        System.out.println("Цвет машины изменился");
        int cost = 0;
        this.color = color;
        cost += 1000;
    }
}