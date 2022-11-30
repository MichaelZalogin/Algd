package javaCourseBlackBelt.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyEx2 {
    public static void main(String[] args) throws IOException {
        try (FileInputStream inputStream =
                     new FileInputStream("C:\\Users\\Professional\\Desktop\\pue.chm");
             FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Professional\\Desktop\\pue123.chm")) {
            int i;
            while ((i = inputStream.read()) != -1) {
                fileOutputStream.write(i);
            }
            System.out.println("Done!");
        }
    }
}