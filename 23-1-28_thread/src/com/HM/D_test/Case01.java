package com.HM.D_test;

import java.util.Random;

public class Case01 {
    public static void main(String[] args) {
        /*
         * 微信中的抢红包也用到了多线程
         * 假设：100块，分成了3个包，现在有5个人去抢
         * 其中，红包是共享数据
         * 5个人是5条线程
         * 打印结果如下：
         *      xxx抢到了xxx元
         *      xxx抢到了xxx元
         *      xxx抢到了xxx元
         *      xxx没抢到
         *      xxx没抢到
         */

        Mythread t1 = new Mythread();
        Mythread t2 = new Mythread();
        Mythread t3 = new Mythread();
        Mythread t4 = new Mythread();
        Mythread t5 = new Mythread();

         t1.setName("1");
         t2.setName("2");
         t3.setName("3");
         t4.setName("4");
         t5.setName("5");

         t1.start();
         t2.start();
         t3.start();
         t4.start();
         t5.start();

    }
}

class Mythread extends Thread {

    static double money = 100;
    static int count = 3;
    static final double MIN = 0.01;

    @Override
    public void run() {
        synchronized (Mythread.class) {
            if (count == 0) {
                System.out.println(getName() + "没有抢到红包！");
            } else {
                //判断，共享数据是否到了末尾（没有到末尾）
                //定义一个变量，表示中奖金额
                double prize = 0;
                if (count == 1) {
                    prize = money;
                } else {
                    Random r = new Random();
                    double bounds = money - (count - 1) * MIN;

                    prize =r.nextDouble()*bounds;

                    if (prize < MIN) {
                        prize = MIN;
                    }


                }
                //从money当中，去掉当前中奖的金额
                money=money-prize;
                count--;
                System.out.println(getName()+"抢到了"+prize+"元");


            }

        }


    }
}
