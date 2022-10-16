package javaCourseOCA.L25;

public class Homework25 {
    public static void main(String[] args) {
        Animal2 a1 = new Mechenosec2("Obj1");
        Animal2 a2 = new Pingvin2("Obj2");
        Animal2 a3 = new Lev2("Obj3");
        Fish2 f1 = new Mechenosec2("Obj4");
        Bird2 b1 = new Pingvin2("Obj5");
        Mammal2 m1 = new Lev2("Obj6");
        Mechenosec2 m2 = new Mechenosec2("Obj7");
        Pingvin2 p1 = new Pingvin2("Obj8");
        Lev2 l1 = new Lev2("Obj9");
        Speakable2 s1 = new Pingvin2("Obj10");
        Speakable2 s2 = new Lev2("Obj11");
        Speakable2[] array1 = {b1, m1, p1, l1};
        Animal2[] array2 = new Animal2[]{a1, a2, a3, f1, b1, m1, m2, p1, l1};

        for (Animal2 a : array2) {
            if (a instanceof Mechenosec2) {
                Mechenosec2 m3 = new Mechenosec2("Obj");
                System.out.println(m3.name);
                m3.eat();
                m3.sleep();
                m3.swim();
            }
            if (a instanceof Pingvin2) {
                Pingvin2 p2 = new Pingvin2("Obj");
                System.out.println(p2.name);
                p2.eat();
                p2.sleep();
                p2.fly();
                p2.speak();
            }
            if (a instanceof Lev2) {
                Lev2 l3 = new Lev2("Obj");
                System.out.println(l3.name);
                l3.eat();
                l3.sleep();
                l3.speak();
                l3.run();
            }
        }

        System.out.println("----------------------------------");

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] instanceof Pingvin2 s5) {
                Pingvin2 p4 = new Pingvin2("Obj");
                System.out.println(p4.name);
                p4.speak();
                p4.eat();
                p4.sleep();
                p4.fly();
            }
            if (array1[i] instanceof Lev2) {
                Lev2 l2 = new Lev2("Obj");
                l2.run();
                l2.eat();
                l2.speak();
                System.out.println(l2.name);
                l2.sleep();
            }
        }
    }
}

abstract class Animal2 {
    Animal2(String name) {
        this.name = name;
    }

    String name;

    abstract void eat();

    abstract void sleep();
}

abstract class Fish2 extends Animal2 {
    Fish2(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void sleep() {
        System.out.println("Всегда интересно наблюдать как спят рыбы");
    }

    abstract void swim();
}

abstract class Bird2 extends Animal2 implements Speakable2 {
    public Bird2(String name) {
        super(name);
        this.name = name;
    }

    abstract void fly();

    @Override
    public void speak() {
        System.out.println(this.name + "sings");
    }
}

abstract class Mammal2 extends Animal2 implements Speakable2 {
    Mammal2(String name) {
        super(name);
        this.name = name;
    }

    abstract void run();
}

interface Speakable2 {
    default void speak() {
        System.out.println("Somebody speak");
    }
}

class Mechenosec2 extends Fish2 {
    Mechenosec2(String name) {
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

class Pingvin2 extends Bird2 {
    Pingvin2(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Пингивин любит есть рыбу");
    }

    @Override
    public void sleep() {
        System.out.println("Пингвины спят прижавшись друг к другу");
    }

    @Override
    public void fly() {
    }

    @Override
    public void speak() {
        System.out.println("Пингвины не умеют петь как соловьи");
    }
}

class Lev2 extends Mammal2 {
    Lev2(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Лев, как и любой хищник, любит мясо");
    }

    @Override
    public void sleep() {
        System.out.println("Большую часть дня лев спит");
    }

    @Override
    void run() {
        System.out.println("Лев это не самая быстрая кошка");
    }
}
