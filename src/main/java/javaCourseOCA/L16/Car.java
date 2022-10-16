package javaCourseOCA.L16;

public class Car {
    String color;
    String engine;

    public Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    public Car abc(String color) {
        Car c10 = new Car(color, "V6");
        return c10;
    }

    public static void main(String[] args) {
        Car c1 = new Car("red", "V8");
        c1.abc("black");
        System.out.println(c1.color);
    }
}