package L12;

public class FlowControl {
    public static void main(String[] args) {
        int a = 19;
        if (a < 20) {
            System.out.println("a меньше 20");
        } else if (a < 30) {
            System.out.println("a меньше 30");
        } else if (a <= 40) {
            System.out.println("a меньше или равно 40");
        } else
            System.out.println("а больше 40");
    }
}

class Car {
    int engine;
    int doorCount;

    public Car(int engine, int doorCount) {
        this.engine = engine;
        this.doorCount = doorCount;
    }

    public static void main(String[] args) {
        Car c1 = new Car(3, 4);
        Car c2 = new Car(2, 5);

        if (c1.engine > c2.engine)
            if (c1.doorCount > c2.doorCount)
                System.out.println("Мощность мотора и кол-во дверей у первой машины больше");
            else System.out.println("Мощность мотора у первой машины больше, а кол-во дверей меньше");
        else System.out.println("Мощность мотора у первой машины меньше");
    }
}