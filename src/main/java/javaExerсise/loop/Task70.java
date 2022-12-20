package javaExerсise.loop;

public class Task70 {
    public static void loop(int x, int y, int r, int[] coords) {
        int in = 0;
        int on = 0;
        double radius = Math.pow(r, 2);
        for (int i = 0; i < coords.length; i += 2) {
            double coord = Math.pow((x - coords[i]), 2) + Math.pow((y - coords[i + 1]), 2);
            if (coord == radius) {
                in++;
            }
            if (coord < radius) {
                on++;
            }
        }
        System.out.println(String.format("На окружности: %d, внутри: %d", in, on));
    }
}