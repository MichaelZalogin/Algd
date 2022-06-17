package L9;

public class Car {
    String color;
    String engine;
    static int count;

    public Car(String color, String engine) {
        count++;
        this.color = color;
        this.engine = engine;
    }

    public void showColor() {
        System.out.println("Цвет машины: " + color);
    }

    public void chanceColor(String color) {
        System.out.println("Цвет машины изменился");
        int cost = 0;
        this.color = color;
        cost += 1000;
    }
}