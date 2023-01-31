package com.HM.D_test;

public class Test01 {
    public static void main(String[] args) {
        /*
         *一共有1000张电影票，可以在两个窗口领取，假设每次领取的时间是3000毫秒，
         * 要求：用多线程模拟卖票并打印剩余的票量
         */
        Cinema cinema = new Cinema();

        Thread t1 = new Thread(cinema,"售票员1");
        Thread t2 = new Thread(cinema,"售票员2");

        t1.start();
        t2.start();


    }


}

class Cinema implements Runnable{

    static private int ticket=1000;
    @Override
    public void run() {
        while (true) {
            synchronized (Cinema.class) {
                if (ticket == 0) {
                    break;
                } else {
                    ticket--;
                    System.out.println(Thread.currentThread().getName()+"已售出一张票，剩余" + ticket + "张电影票");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
