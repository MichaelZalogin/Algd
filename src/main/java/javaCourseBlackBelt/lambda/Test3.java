package javaCourseBlackBelt.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Test3 {
    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> arrayList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            arrayList.add(carSupplier.get());
        }
        return arrayList;
    }

    public static void main(String[] args) {
        ArrayList<Car> ourCars = createThreeCars(() ->
                new Car("A8", "Black", 2));
        System.out.println(ourCars);
    }
}

class Car {
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}