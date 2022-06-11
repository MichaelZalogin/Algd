package L4;

public class Car {
    String color = "Red";
    String engine = "V6";
}

class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = car2;
        Car car4;
        System.out.println(car3.color + " \n" + car3.engine);
    }
}
