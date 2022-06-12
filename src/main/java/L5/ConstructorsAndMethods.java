package L5;

public class ConstructorsAndMethods {
}

class Test20 {
    int summa(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }

    public static void main(String[] args) {
        Test20 t1 = new Test20();
        int d = t1.summa(4, 5, 6);
        System.out.println(d);
    }
}