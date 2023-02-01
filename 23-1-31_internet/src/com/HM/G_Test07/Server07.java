package com.HM.G_Test07;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server07 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(1000);
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
