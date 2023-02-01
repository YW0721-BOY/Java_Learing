package com.HM.F_TCPdemo;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //TCP协议，发送数据

        /*
         * 1.创建Socket对象
         * 细节：在创建对象的同时会连接服务端
         *      如果连接不上，代码会报错
         */

        Socket socket = new Socket("127.0.0.1", 1000);

        OutputStream os=socket.getOutputStream();
        os.write("你好，我是客户端".getBytes());

        os.close();
        socket.close();
    }
}
