package javaCourseBlackBelt.io;

import java.io.*;

public class CopyEx {
    public static void main(String[] args) {
        String rubai = "Много лет размышлял я над жизнью земной.\n" +
                "Непонятного нет для меня под луной.\n" +
                "Мне известно, что мне ничего не известно!\n" +
                "Вот последняя правда открытая мной.";
        try (BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter("C:\\Users\\Professional\\Desktop\\test2.txt"));
             BufferedReader bufferedReader = new BufferedReader(
                     new FileReader("C:\\Users\\Professional\\Desktop\\test1.txt"))) {
            bufferedWriter.write(rubai);
            String line;
            int character;
            while ((character = bufferedReader.read()) != -1) {
                System.out.print((char) character);
            }
            while ((line = bufferedReader.readLine()) != null) {
                System.out.print(line);
            }
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}