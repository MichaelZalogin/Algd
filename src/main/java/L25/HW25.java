package L25;

public class HW25 {
    public static void main(String[] args) {
        Mechenosec m1 = new Mechenosec("Karl");
        System.out.println(m1.name);
        m1.eat();
        m1.swim();
        m1.sleep();
        Speakable s1 = new Penguin("Kovalsky");
        s1.speak();
        Animal a1 = new Lion("Lion1");
        System.out.println(a1.name);
        a1.eat();
        a1.sleep();
        Mammal mam = new Lion("Lion2");
        System.out.println(mam.name);
        mam.eat();
        mam.run();
        mam.sleep();
    }
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

class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void eat() {
        System.out.println("The penguin eats");
    }

    @Override
    void sleep() {
        System.out.println("The penguin sleeps");
    }

    @Override
    void fly() {
        System.out.println("The penguin doesn't fly");
    }

    @Override
    public void speak() {
        System.out.println("The penguin speaks");
    }
}

class Lion extends Mammal {

    public Lion(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void eat() {
        System.out.println("The lion eats meat");
    }

    @Override
    void sleep() {
        System.out.println("The lion sleep");
    }

    @Override
    public void speak() {
        System.out.println("The lion roars");
    }

    @Override
    void run() {
        System.out.println("The lion runs fast");
    }
}