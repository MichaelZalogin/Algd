package javaCourseOCA.L26;

public class MethodEquals {
}

class Car {
    String color;
    String engine;

    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            Car c2 = (Car) obj;
            return (this.color.equals(c2.color) && this.engine.equals(c2.engine));
        }
        return false;
    }
}

class Test1 {
    public static void main(String[] args) {
        Car c1 = new Car("Red", "V4");
        Car c2 = new Car("Red", "V4");
        Car c3 = new Car("Black", "V8");
        System.out.println(c1 == c2);
        System.out.println(c1.equals(c2));
    }
}