package com.HM.A_InetAddressDemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MyInetAddressDemo1 {
    public static void main(String[] args) throws UnknownHostException {
        /*
         *  static InetAddress getByName(String host)   确定主机名称的IP地址。主机名称可以是机器名称，也可以是IP地址
         *  String getHostName()                        获取此IP地址的主机名
         *  String getHostAddress()                     返回文本显示中的IP地址字符串
         */


        //ip的对象
        InetAddress address =InetAddress.getByName("DESKTOP-3PKKEII");
        System.out.println(address);

        String hostName = address.getHostName();
        System.out.println(hostName);
        String hostAddress = address.getHostAddress();
        System.out.println(hostAddress);



    }
}
