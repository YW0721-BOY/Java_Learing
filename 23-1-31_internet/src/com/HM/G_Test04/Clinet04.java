package com.HM.G_Test04;

import java.io.*;
import java.net.Socket;

public class Clinet04 {
    public static void main(String[] args) throws IOException {
        /*
         * TCP通信---上传文件
         * 客户端：将本地文件上传到服务器。接收服务器的反馈。
         * 服务器：接收客户端上传的文件，上传完毕之后给出反馈。
         */

        Socket socket = new Socket("127.0.0.1", 1000);

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("23-1-31_internet\\src\\com\\HM\\G_Test03\\Clinet\\回族人家.jpg"));

        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());

        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }

        socket.shutdownOutput();

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s = br.readLine();
        System.out.println(s);


        socket.close();
    }
}

