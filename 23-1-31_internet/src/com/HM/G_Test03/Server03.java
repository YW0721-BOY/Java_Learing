package com.HM.G_Test03;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server03 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1000);

        Socket socket = serverSocket.accept();

        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        BufferedOutputStream bos =new BufferedOutputStream(new FileOutputStream("23-1-31_internet\\src\\com\\HM\\G_Test03\\Server\\回族人家.jpg"));
        int len;
        byte[] bytes = new byte[1024];
        while ((len= bis.read())!=-1){
            bos.write(bytes,0,len);
        }


        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("文件已经上传完毕");
        bw.newLine();
        bw.flush();

        socket.close();
        serverSocket.close();

    }
}
