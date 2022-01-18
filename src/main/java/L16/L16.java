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
    public Car abc (String cvet) {
     Car c10 = new Car(cvet, "V4");
     return c10;
    }

    public static void main(String[] args) {
        Car x = new Car("red","V6");// 35:10
        Car c2 = x.abc("black");
        System.out.println(x.color);
    }
}

class TestCar {
    final static Car c = new Car ("red", "V8");
    public static void main(String[] args) {
       c.color = "black";
    }
}