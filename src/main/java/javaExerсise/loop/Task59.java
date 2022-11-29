package javaExerсise.loop;

public class Task59 {
    public static void loop(int num, int[] array) {
        int x = 0, y = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < num)
                x++;
            if (array[i] == num)
                y++;
        }
        System.out.println("Равно: " + y + ", меньше: " + x);
    }
}