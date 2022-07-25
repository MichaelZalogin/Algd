package JavaCourseOCA.L21;

public class Test1 {
    public static void main(String[] args) {
        int a = 7;
        System.out.println(a < 4 ? 7 : "privet");
        int b = 5;
        int c = (a < 6 ? a++ : b++);
        System.out.println("a = " + a + "\n" + "b = " + b);
        String s1, s2;
        s1 = new String("privet");
        s2 = new String("poka");
        s1 = s2;
        String s3 = s1;
        s1 = null;
        Test2 t2 = new Test2();
    }
}

class Test2 {
    Test2() {
        System.out.println("Created");
    }

    public void abc(String s) {
        System.out.println(s);
    }

    public void abc(boolean b) {
        System.out.println(b);
    }

    private StringBuilder abc(StringBuilder sb) {
        System.out.println(sb);
        return new StringBuilder("poka");
    }
}