package com.HM.A_thread;

public class ThreadDemo5 {

    /*
    *Priority:优先级  1，5，10
     */

    public static void main(String[] args) {
        MyRunnable mr =new MyRunnable();

        Thread t1 =new Thread(mr,"飞机");
        Thread t2 =new Thread(mr,"坦克");
//        System.out.println(t1.getPriority());
//        System.out.println(t2.getPriority());
//        System.out.println(Thread.currentThread().getPriority());

        t1.setPriority(10);
        t2.setPriority(1);


        t1.start();
        t2.start();
    }

}

class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <100; i++) {
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
