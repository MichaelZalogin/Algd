package javaCourseBlackBelt.generics;

public class ParameterizedClass {
    public static void main(String[] args) {
        Info<String, Integer> info1 = new Info<>("privet", 18);
        System.out.println(info1);
        Info<Integer, String> info2 = new Info<>(18, "privet");
        String s = info1.getValue1();
        Integer i1 = info2.getValue1();
    }
}

class Info<T, V> {
    private T value1;
    private V value2;

    public Info(T value1, V value2) {
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