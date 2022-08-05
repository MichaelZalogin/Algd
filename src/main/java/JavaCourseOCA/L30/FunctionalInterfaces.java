package JavaCourseOCA.L30;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionalInterfaces {

    public static ArrayList<Car> createThreeCar(Supplier<Car> carSupplier) {
        ArrayList<Car> al = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            al.add(carSupplier.get());
        }
        return al;
    }

    public static void changeCar(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car);

    }

    public static void main(String[] args) {
        ArrayList<Car> ourCar = createThreeCar(() -> new Car("silver", "Nissan Tiida", 1.6));
        System.out.println("OurCar" + ourCar);

        changeCar(ourCar.get(0), car -> {
            car.color = "Black";
            car.engine = 1.6;
            car.model = "Geely";
            System.out.println("Updated" + car);
        });

        System.out.println("OurCar" + ourCar);
    }
}

class Car {
    String color;
    String model;
    double engine;

    public Car(String color, String model, double engine) {
        this.color = color;
        this.model = model;
        this.engine = engine;
    }

    public String toString() {
        return "Our car is " + model + ", color is " + color + " and engine = " + engine;
    }
}