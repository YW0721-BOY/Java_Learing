package com.HM.D_test;

/*
 * 没做出来
 */
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test02 {
    public static void main(String[] args) {
        /*
         * 同时开启两个线程，共同获取1-100之间的所有数字
         * 要求：将输出所有奇数
         */

        Number number = new Number();

        Thread t1 = new Thread(number, "甲");
        Thread t2 = new Thread(number, "乙");

        t1.start();
        t2.start();

    }
}


class Number implements Runnable {

    static int n=0;
    @Override
    public void run() {
        while (true){
            synchronized (Number.class){
                try {
                    Number.class.notify();
                    if (n<100){
                        n++;
                        if (n%2!=0){
                            System.out.println(Thread.currentThread().getName()+"输出"+n);
                        }
                        Number.class.wait();
                    }else {
                        break;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
