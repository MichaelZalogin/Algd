package javaExerсise.loop;

public class Task64 {
    public static void loop(int[] months) {
        int winter = 0;
        int spring = 0;
        int summer = 0;
        int fall = 0;
        for (int i = 0; i < months.length; i++) {
            switch (months[i]) {
                case 1, 2, 12 -> winter++;
                case 3, 4, 5 -> spring++;
                case 6, 7, 8 -> summer++;
                case 9, 10, 11 -> fall++;
            }
        }
        System.out.println(String.format("Зимой: %d, Весной: %d, Летом: %d, Осенью: %d",
                winter, spring, summer, fall));
    }
}