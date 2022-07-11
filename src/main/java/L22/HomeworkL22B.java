package L22;

public class HomeworkL22B {
}

class Animal5 {
    int eyes;

    Animal5() {
        System.out.println("I am Animal");
    }

    void eat() {
        System.out.println("Animals eats");
    }

    void drink() {
        System.out.println("Animals drinks");
    }
}

class Pet extends Animal5 {
    String name;
    final int TAIL = 1;
    final int PAW = 4;


    Pet() {
        System.out.println("I am pet");
        eyes = 2;
    }

    void run() {
        System.out.println("Pet runs");
    }

    void jump() {
        System.out.println("Pet jumps");
    }
}

class Dog extends Pet {
    Dog(String name) {
        this.name = name;
        System.out.println("I am dog and my name is " + name);
    }

    void play() {
        System.out.println("Dog plays");
    }
}

class Cat extends Pet {
    Cat(String name) {
        this.name = name;
        System.out.println("I am cat and my name is " + name);
    }

    void sleep() {
        System.out.println("Cat sleeps");
    }
}

class Test11 {
    public static void main(String[] args) {
        Dog d1 = new Dog("Bobik");
        System.out.println(d1.PAW);
        Cat c1 = new Cat("Mur");
        c1.sleep();
    }
}