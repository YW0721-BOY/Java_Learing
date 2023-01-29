package com.HM.A_thread;

public class ThreadDemo2 {
    public static void main(String[] args) {
        MyThread1 r1 = new MyThread1();
        MyThread1 r2 = new MyThread1();
        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);

        t1.start();
        t2.start();


    }
}

class MyThread1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            Thread thread = Thread.currentThread();
            System.out.println(thread.getName()+"你好");
        }
    }
}
