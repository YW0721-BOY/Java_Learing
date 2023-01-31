package com.HM.D_UDPDemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;

public class SendMessageDemo {
    public static void main(String[] args) throws IOException {
        /*
         * 组播发送端代码
         */

        //创建MulticastSocket对象
        MulticastSocket ms = new MulticastSocket();

        //创建DatagramPacket对象
        String s ="你好，你好！";
        byte[] bytes = s.getBytes();
        InetAddress address =InetAddress.getByName("224.0.0.1");
        int port =10000;

        DatagramPacket packet = new DatagramPacket(bytes,bytes.length,address,port);

        ms.send(packet);

        ms.close();

    }
}
