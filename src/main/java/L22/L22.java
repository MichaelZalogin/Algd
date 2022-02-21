package L22;

public class L22 {
    public static void main(String[] args) {
        int i = 2;
        String s = new String[]{"a", "b", "c", "d"}[i];
        System.out.println(s);
    }
}

class Chelovek {
    final String pol;

    Chelovek(String pol) {
        this.pol = pol;
    }
    String name;
    int age;
    int weight;
}
class TestChelovek {

}
