package com.HM.Mydynamicproxy;
/*
* 需求：
*  外边的人想要大明星唱一首歌
*  1.获取代理的对象
*          代理的对象=ProxyUtil.createProxy(大明星的对象);
*  2.再调用代理的唱歌方法
*          代理对象.唱歌的方法();
*/
public class Test {
    public static void main(String[] args) {
        BigStar kongkong = new BigStar("kongkong");

        Star proxy = ProxyUtil.createProxy(kongkong);

        String result = proxy.sing("及你太美");
        proxy.dance();

        System.out.println(result);

    }
}
