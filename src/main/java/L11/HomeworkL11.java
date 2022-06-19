package L11;

public class HomeworkL11 {
}

class Car {
    String color;
    String engine;
    int kolichestvo_dverei;

    public Car(String color, String engine, int kolichestvo_dverei) {
        this.color = color;
        this.engine = engine;
        this.kolichestvo_dverei = kolichestvo_dverei;
    }

    public Car() {
    }

    public void zamena_dverey(int a) {
        this.kolichestvo_dverei = a;
    }

    public static void zamena_cveta(Car c1, Car c2) {
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
        c1.zamena_dverey(8);
        c2.zamena_dverey(12);
        System.out.println(c1.kolichestvo_dverei);
        System.out.println(c2.kolichestvo_dverei);
        Car.zamena_cveta(c1, c2);
        System.out.println(c1.color);
        System.out.println(c2.color);
    }
}