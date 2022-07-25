package JavaCourseOCA.L17;

public class HomeworkL17 {
    public static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2) {
        boolean result = true;
        if (sb1.length() == sb2.length() && sb1.capacity() == sb1.capacity()) {
            for (int i = 0; i < sb1.length(); i++) {
                if (sb1.charAt(i) != sb2.charAt(i)) {
                    result = false;
                    break;
                }
            }
        } else {
            result = false;
        }
        return result;
    }
}

class Test {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Hello");
        StringBuilder sb3 = new StringBuilder("Privet");
        boolean check = HomeworkL17.ravenstvo(sb1, sb2);
        System.out.println(check);
        boolean check1 = HomeworkL17.ravenstvo(sb3, sb2);
        System.out.println(check1);
    }
}