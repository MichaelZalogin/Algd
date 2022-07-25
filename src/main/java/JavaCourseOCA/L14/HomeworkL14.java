package JavaCourseOCA.L14;

public class HomeworkL14 {

    public static void time() {
        HOUR:
        for (int i = 0; i < 6; i++) {
            MINUTE:
            for (int j = 0; j < 60; j++) {
                if (i > 1 && j % 10 == 0) {
                    break HOUR;
                }
                SEC:
                for (int k = 0; k < 60; k++) {
                    if (i * k > j) {
                        continue MINUTE;
                    }
                    System.out.println(i + ":" + j + ":" + k);
                }
            }
        }
    }

    public static void main(String[] args) {
        time();
    }
}