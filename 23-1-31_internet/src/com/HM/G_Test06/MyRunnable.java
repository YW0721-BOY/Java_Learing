package com.HM.G_Test06;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class MyRunnable implements Runnable {
    Socket socket;

    public MyRunnable(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
            String str = UUID.randomUUID().toString().replace("-", "");
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("23-1-31_internet\\src\\com\\HM\\G_Test05\\Server\\" + str + ".jpg"));
            int len;
            byte[] bytes = new byte[1024];
            while ((len = bis.read()) != -1) {
                bos.write(bytes, 0, len);
            }


            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write("文件已经上传完毕");
            bw.newLine();
            bw.flush();


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (socket!=null) {
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
