package L25;

public class HW25 {
}

abstract class Animal {

    Animal(String name) {
        this.name = name;
    }

    String name;

    abstract void eat();

    abstract void sleep();
}

abstract class Fish extends Animal {

    Fish(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void sleep() {
        System.out.println("Fish sleeps");
    }

    abstract void swim();
}

abstract class Bird extends Animal implements Speakable {

    Bird(String name) {
        super(name);
        this.name = name;
    }

    abstract void fly();

    public void speak() {
        System.out.println(name + " sings");
    }
}

interface Speakable {
    default void speak() {
        System.out.println("Somebody speaks");
    }
}

abstract class Mammal extends Animal implements Speakable {

    public Mammal(String name) {
        super(name);
        this.name = name;
    }

    abstract void run();
}

class Mechenosec extends Fish {

    public Mechenosec(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void eat() {
        System.out.println("Ribiy korm");
    }

    @Override
    void swim() {
        System.out.println("Bistro plavaet");
    }
}