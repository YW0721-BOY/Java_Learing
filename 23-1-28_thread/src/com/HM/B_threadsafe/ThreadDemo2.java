package com.HM.B_threadsafe;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadDemo2 {
    public static void main(String[] args) {
        /*
         * 需求：
         *      某电影院目前正在上映国产大片，共有100张票，三个窗口去售卖，设计程序模拟卖票
         *      用jdk5的lock实现
         */
        Cinema cinema = new Cinema();

        Thread t1 = new Thread(cinema, "窗口1");
        Thread t2 = new Thread(cinema, "窗口2");
        Thread t3 = new Thread(cinema, "窗口3");

        t1.start();
        t2.start();
        t3.start();

    }
}

class Cinema01 implements Runnable {

    int ticket = 0;
    static Lock lock = new ReentrantLock();

    @Override
    public void run() {

        while (true) {
            try {
                //synchronized (this) {
                lock.lock();
                if (ticket < 100) {
                    ticket++;
                    System.out.println(Thread.currentThread().getName() + "正在卖" + ticket + "票");
                    Thread.sleep(100);

                } else {
                    break;
                }
                //}
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }

    }


}
