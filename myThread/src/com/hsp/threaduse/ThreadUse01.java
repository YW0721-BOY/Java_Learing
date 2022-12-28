package com.hsp.threaduse;

/*
 * main 为主线程、主线程结束不意味着其他线程同时结束
 * 当main线程启动一个子线程 Thread-0，主线程不会阻塞，会继续执行
 * 问题:Cat类不是重写了run方法么？为什么不直接调用run方法
 * run方法就是一个普通的方法，没有真正的启动一个线程，就会把run方法执行完毕，才向下执行。
 * 真正实现多线程的效果，是start0(),不是run
 */
public class ThreadUse01 {
    public static void main(String[] args) throws InterruptedException {

        Cat cat = new Cat();

        //start()源码
        /*
        (1)
        public synchronized void start() {
            start0();
        }
        (2)
        //start0() 是本地方法，是由JVM调用，底层是C/C++实现
        //真正实现多线程的效果，是start0(),不是run
        private native void start0();

        注意：start()方法调用start0()方法后，该线程并不一定会立马执行，只是将线程变成了可运行状态。
        具体是什么时候执行，取决于CPU，由CPU统一调度。
         */

        cat.start();
        //cat.run();//run方法就是一个普通的方法，没有真正地启动一个线程，就会把run方法执行完毕，才向下执行。

        //说明：当main线程启动一个子线程 Thread-0，主线程不会阻塞，会继续执行
        //这时，主线程和子线程时交替执行……
        System.out.println("主线程执行中……");
        for (int i = 0; i < 60; i++) {
            System.out.println("主线程 i="+i);
            Thread.sleep(1000);
        }
    }
}
/*
    @Override
    public void run() {
            if (target != null) {
                target.run();
            }
        }
 */

class Cat extends Thread{
    @Override
    public void run() {

        int count =0;
        while (true) {
            System.out.println("这里是一只猫");
            count++;
            if (count==80) break;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

