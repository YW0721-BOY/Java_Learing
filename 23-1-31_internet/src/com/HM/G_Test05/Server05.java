package com.HM.G_Test05;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class Server05 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1000);

        while (true) {
            Socket socket = serverSocket.accept();
           // MyRunnable myRunnable = new MyRunnable(socket);

            new Thread(new MyRunnable(socket)).start();

        }


    }
}
