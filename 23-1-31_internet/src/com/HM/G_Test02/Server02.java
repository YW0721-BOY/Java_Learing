package com.HM.G_Test02;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server02 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(10000);
        Socket accept = serverSocket.accept();

        InputStreamReader is = new InputStreamReader(accept.getInputStream());
        int b;
        /*
         * 细节：
         * read方法会从连接通道中读取数据
         * 但是，需要有一个结束标记，此处的循环才会停止
         * 否则，程序就会一直停在read方法这里，等待读取下面的数据
         */

        while ((b=is.read())!=-1){
            System.out.print((char) b);
        }


        OutputStream os =accept.getOutputStream();
        os.write("你好，我是服务器，确认可连接".getBytes());

        serverSocket.close();
        is.close();
    }
}
