package com.HM.G_Test02;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class Client02 {
    /*
     * TCP通信：接受和反馈
     * 客户端：发送一条数据，接收服务端反馈的消息并打印
     * 服务器：接收数据并打印，再给客户端反馈消息
     */
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 10000);

        OutputStream os=socket.getOutputStream();

        os.write("你好，我是客户端，请确认连接".getBytes());
        socket.shutdownOutput();


        InputStreamReader is = new InputStreamReader(socket.getInputStream());
        int b;
        while ((b=is.read())!=-1){
            System.out.print((char) b);
        }

        socket.close();

    }
}
