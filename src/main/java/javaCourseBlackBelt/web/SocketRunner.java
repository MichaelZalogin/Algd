package javaCourseBlackBelt.web;

import java.io.*;
import java.net.Inet4Address;
import java.net.Socket;
import java.util.Scanner;

public class SocketRunner {
    public static void main(String[] args) throws IOException {
        /** Client */
        var name = Inet4Address.getByName("localhost");
        try (var socket = new Socket(name, 7777);
             var outputStream = new DataOutputStream(socket.getOutputStream());
             var inputStream = new DataInputStream(socket.getInputStream());
             var scanner = new Scanner(System.in)) {
            while (scanner.hasNextLine()) {
                scanner.nextLine();
                outputStream.writeUTF("Hello server");
            }
            System.out.println(inputStream.readUTF());
        }
    }
}
