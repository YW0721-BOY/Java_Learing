package com.HM.D_UDPDemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class ReceiveMessageDemo1 {
    public static void main(String[] args) throws IOException {
        /*
         * 组播方式接收端代码
         */

        MulticastSocket ms =new MulticastSocket(10000);

        InetAddress address = InetAddress.getByName("224.0.0.1");
        ms.joinGroup(address);

        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

        ms.receive(dp);

        byte[] data = dp.getData();
        int length = dp.getLength();
        String hostAddress = dp.getAddress().getHostAddress();
        String hostName = dp.getAddress().getHostName();

        System.out.println("ip为:"+hostAddress+",主机名为："+hostName+"的人，发送了数据："+new String(data,0,length));

        ms.close();
    }
}
