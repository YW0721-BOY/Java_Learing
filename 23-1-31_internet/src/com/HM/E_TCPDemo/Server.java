package com.HM.E_TCPDemo;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class Server {
    public static void main(String[] args) throws IOException {
        //TCP协议，接收数据
        ServerSocket serverSocket = new ServerSocket(1000);

        Socket accept = serverSocket.accept();

        InputStream is=accept.getInputStream();

        int data;
        while ((data=is.read())!=-1){
            System.out.print((char) data);
        }
        System.out.println();

        serverSocket.close();
    }
}
