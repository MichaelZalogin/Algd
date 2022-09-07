package javaCourseBlackBelt.nested_classes.inner_classes;

public class Car {
    String color;
    int doorCount;
    Engine engine;

    public Car(String color, int doorCount, int horsePower) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = this.new Engine(horsePower);
    }

//    void method() {
//        System.out.println(Engine.countOfObject);
//        Engine e = new Engine(200);
//        System.out.println(e.horsePower);
//    }

    @Override
    public String toString() {
        return "My car: {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public class Engine {
        private int horsePower;

        public Engine(int hoursePower) {
        }

        @Override
        public String toString() {
            return "My engine: {" +
                    "hoursePower=" + horsePower +
                    '}';
        }
    }
}

class Test {
    public static void main(String[] args) {
        Car car = new Car("Red", 3, 300);
        Car.Engine engine = car.new Engine(232);
    }
}