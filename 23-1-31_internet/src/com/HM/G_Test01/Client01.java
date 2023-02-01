package com.HM.G_Test01;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client01 {
    public static void main(String[] args) throws IOException {
        /*
         * 客户端：多次发送数据
         * 服务端：接收多次接收数据，并打印
         */

        Socket socket = new Socket("127.0.0.1", 10000);

        Scanner sc =new Scanner(System.in);
        OutputStream os = socket.getOutputStream();

        while (true) {
            System.out.println("请输入你要输入的数据");
            String str = sc.nextLine();

            if (str.equals("886")){
                break;
            }
            os.write(str.getBytes());
        }


        socket.close();
    }
}
