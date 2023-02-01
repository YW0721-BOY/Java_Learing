package com.HM.G_Test01;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server01 {
    public static void main(String[] args) throws IOException {
        /*
         * 客户端：多次发送数据
         * 服务端：接收多次接收数据，并打印
         */

        ServerSocket ss = new ServerSocket(10000);

        Socket accept = ss.accept();
        InputStreamReader isr=new InputStreamReader(accept.getInputStream());

        int b;
        while ((b= isr.read())!=-1){
            System.out.print((char) b);
        }
        System.out.println();
        ss.close();
    }
}
