package JavaCourseOCA.L27;

import java.io.*;

public class Exceptions {
    public static void main(String[] args) {
        File s = new File("C:\\Users\\HHos\\IdeaProjects\\Udemy\\src\\main\\java\\test9.txt");
//        int[] array = {4, 8, 1};
//        System.out.println("У нас есть массив");
        System.out.println("Спокойной работал, захотел импортировать файл");
        try {
            FileInputStream fis = new FileInputStream(s);
//            System.out.println(array[5]);
            System.out.println("Файл найден!");
        } catch (FileNotFoundException e) {
            System.out.println("Не нашел файл и поймал ошибку: " + e);
        } catch (NullPointerException e) {
            System.out.println("Не нашел файл и поймал ошибку: " + e);
        } finally {
            System.out.println("Эта часть обрабатывается всегда");
        }
        System.out.println("Продолжаем работать дальше");
    }
}