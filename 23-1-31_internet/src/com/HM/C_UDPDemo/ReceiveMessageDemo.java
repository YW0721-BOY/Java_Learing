package com.HM.C_UDPDemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class ReceiveMessageDemo {
    public static void main(String[] args) throws IOException {


        DatagramSocket ds = new DatagramSocket(10086);



            byte[] bytes = new byte[1024];
            DatagramPacket dp =new DatagramPacket(bytes,bytes.length);
        while (true) {
            ds.receive(dp);

            byte[] data = dp.getData();
            InetAddress address = dp.getAddress();
            int port = dp.getPort();
            int length = dp.getLength();


            System.out.print("数据长度："+length+" ");
            System.out.print("端口号："+port+" ");
            System.out.print("数据来源地址："+address+" ");
            System.out.println(new String(data,0,length));


        }

    }
}
