package L16;

public class L16 {
}

class Car {
    String color;
    String engine;

    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }
    final static int a = 5;

    public static void main(String[] args) {
        a = 10;
    }
}
class TestCar {
    final static Car c = new Car ("red", "V8")
}