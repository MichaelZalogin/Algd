package javaCourseBlackBelt.generics;

public class Test2 {
    public static void main(String[] args) {
        X x = new Y();
        //ArrayList <X> list = new ArrayList <Y>();
        Info2<X, Integer> info2 = new Info2<>();
    }
}

interface I1 {
}

interface I2 {
}

class X extends Number implements I1, I2 {
    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }
}

class Y extends X {
}

class Info2<T extends Number & I1 & I2, V extends Number> {
    private T value1;
    private V value2;

    public Info2() {
    }

    public Info2(T value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public String toString() {
        return "({[" + value1 + value2 + ")}]";
    }

    public T getValue1() {
        return value1;
    }

    public V getValue2() {
        return value2;
    }
}