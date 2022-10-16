package javaCourseOCA.L16;

public class HomeworkL16 {
    public static void email(String s) {
        if (s.endsWith("yahoo.com")) {
            System.out.println("yahoo");
        }
        if (s.endsWith("@mail.ru")) {
            System.out.println("mail");
        }
        if (s.endsWith("@gmail.com")) {
            System.out.println("gmail");
        }
    }

}

class TestHW {
    public static void main(String[] args) {
        HomeworkL16.email("zaloginmiha@gmail.com");
    }
}

class Lesson16 {
    public static void mail(String s1) {
        int a = 0;
        int b = 0;
        int c = 0;
        while (c < (s1.length() - 1)) {
            a = s1.indexOf('@', c);
            b = s1.indexOf('.', c);
            c = s1.indexOf(';', c + 1);
            System.out.println(s1.substring(a + 1, b));
        }
    }

    public static void main(String[] args) {
        Lesson16.mail("ya@yahoo.com; on@mail.ru; ona@gmail.com");
    }
}