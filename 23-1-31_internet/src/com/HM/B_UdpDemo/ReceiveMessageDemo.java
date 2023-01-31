package com.HM.B_UdpDemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class ReceiveMessageDemo {
    public static void main(String[] args) throws IOException {
        /*
         * 发送数据
         *
         * 1.创建DatagramSocket对象（快递公司）
         *
         * 细节：
         * 绑定端口，以后我们就是通过这个端口往外发送
         * 空参：所有可用的端口中随机一个进行使用
         * 有参：指定端口号进行绑定
         */

        DatagramSocket ds = new DatagramSocket(10086);



        byte[] bytes = new byte[1024];
        DatagramPacket packet = new DatagramPacket(bytes,bytes.length);


        /*
         * 该方法是阻塞的
         * 程序执行到这一步的时候，会在这里死等
         * 等发送端发送消息
         */
        ds.receive(packet);

        byte[] data = packet.getData();
        int length = packet.getLength();
        InetAddress address = packet.getAddress();
        int port = packet.getPort();

        System.out.println("接收到的数据："+new String(bytes,0,length));
        System.out.println("数据的长度："+length);
        System.out.println("数据的地址："+address);
        System.out.println("数据的端口："+port);

    }
}
