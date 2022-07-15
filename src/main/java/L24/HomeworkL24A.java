package L24;

public class HomeworkL24A {
}

abstract class Animal2 {
    Animal2(String name) {
        this.name = name;
    }

    String name;

    abstract void eat();

    abstract void sleep();
}

abstract class Fish extends Animal2 {
    Fish(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void sleep() {
        System.out.println("Всегда интересно наблюдать как спят рыбы");
    }

    abstract void swim();
}

abstract class Bird extends Animal2 implements Speakable {
    public Bird(String name) {
        super(name);
        this.name = name;
    }

    abstract void fly();

    @Override
    public void speak() {
        System.out.println(this.name + "sings");
    }
}

abstract class Mammal extends Animal2 implements Speakable {
    Mammal(String name) {
        super(name);
        this.name = name;
    }

    abstract void run();
}

interface Speakable {
    default void speak() {
        System.out.println("Somebody speak");
    }
}

class Mechenosec extends Fish {
    Mechenosec(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println("Меченосец красивая рыба, которая быстро плавает");
    }

    @Override
    public void eat() {
        System.out.println("Меченосец не хищная рыба и она ест обычный рыбий корм");
    }
}