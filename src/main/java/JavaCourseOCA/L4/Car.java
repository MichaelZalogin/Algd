package JavaCourseOCA.L4;

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
        car1.color = "Black";
        car1.engine = "V8";
        System.out.println("Цвет: " + car1.color);
        System.out.println("Мотор: " + car1.engine);
        String name2 = new String("name");
        System.out.println(car3.color + " \n" + car3.engine);
        System.out.println(new Car().color);
    }
}
