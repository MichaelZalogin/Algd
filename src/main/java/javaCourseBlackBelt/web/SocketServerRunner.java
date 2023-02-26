package javaCourseBlackBelt.web;

import java.io.*;
import java.net.ServerSocket;
import java.util.Scanner;

public class SocketServerRunner {
    public static void main(String[] args) throws IOException {
        /** Server */
        try (var serverSocket = new ServerSocket(7777, 10);
             var socket = serverSocket.accept();
             var dataOutputStream = new DataOutputStream(socket.getOutputStream());
             var dataInputStream = new DataInputStream(socket.getInputStream());
             var scanner = new Scanner(System.in)) {
            var request = dataInputStream.readUTF();
            while (!"stop".equals(request)) {
                System.out.println("Client request: " + request);
                var response = scanner.nextLine();
                dataOutputStream.writeUTF(response);
                request = dataInputStream.readUTF();
            }
        }
    }
}
