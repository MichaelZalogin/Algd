package javaCourseBlackBelt.web;

import java.io.IOException;
import java.net.URL;

public class UrlExample {
    public static void main(String[] args) throws IOException {
        var url = new URL("file:/projects/Udemy/src/main/java/javaCourseBlackBelt/web/SocketRunner.java");
        var urlConnection = url.openConnection();
        System.out.println(new String(urlConnection.getInputStream().readAllBytes()));
    }

    private static void checkGoogle() throws IOException {
        var url = new URL("https://www.google.com");
        var urlConnection = url.openConnection();
        var map = urlConnection.getHeaderFields();//параметры заголовка
        var content = urlConnection.getContent();//тело
    }
}
