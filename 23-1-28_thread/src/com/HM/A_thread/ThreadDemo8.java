package com.HM.A_thread;

public class ThreadDemo8 {
    public static void main(String[] args) throws InterruptedException {
        MyThread04 myThread04 = new MyThread04();
        myThread04.setName("土豆");
        myThread04.start();


        /*
         * 表示把myThread04这个线程，插入到当前线程之前
         * myThread04:土豆
         * 当前线程：main
         */
        myThread04.join();

        for (int i = 0; i < 10; i++) {
            System.out.println("main线程"+i);
        }
    }
}


class MyThread04 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+"@"+i);
        }
    }
}