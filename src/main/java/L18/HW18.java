package L18;

public class HW18 {
}

class Test {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("123");
        StringBuilder sb2 = new StringBuilder(sb1.append("45"));
        sb2 = sb1.append("6").append("7");
        System.out.println("sb1 = " + sb1);
        System.out.println("sb2 = " + sb2);
        StringBuilder sb3 = new StringBuilder("Hello");
        StringBuffer sbf1 = new StringBuffer("Good Bye");
        String s1 = new String(sb1);
        String s2 = new String(sbf1);
    }
}