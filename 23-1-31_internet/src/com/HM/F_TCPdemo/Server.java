package com.HM.F_TCPdemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //TCP协议，接收数据
        ServerSocket serverSocket = new ServerSocket(1000);

        Socket accept = serverSocket.accept();

        InputStream is=accept.getInputStream();//只能一个字节一个字节的读，导致中文会乱码
        InputStreamReader isr =new InputStreamReader(is);

        int data;
        while ((data=isr.read())!=-1){
            System.out.print((char) data);
        }
        System.out.println();

        serverSocket.close();
    }
}
