package JavaCourseOCA.L11;

public class HomeworkL11 {
}

class Car {
    String color;
    String engine;
    int doorCount;

    public Car(String color, String engine, int doorCount) {
        this.color = color;
        this.engine = engine;
        this.doorCount = doorCount;
    }

    public Car() {
    }

    public void swapDoors(int a) {
        this.doorCount = a;
    }

    public static void swapColor(Car c1, Car c2) {
        Car c3 = new Car();
        c3.color = c1.color;
        c1.color = c2.color;
        c2.color = c3.color;
    }
}

class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car("Black", "V8", 4);
        Car c2 = new Car("White", "V10", 2);
        c1.swapDoors(8);
        c2.swapDoors(12);
        System.out.println(c1.doorCount);
        System.out.println(c2.doorCount);
        Car.swapColor(c1, c2);
        System.out.println(c1.color);
        System.out.println(c2.color);
    }
}