package com.HM.A_thread;

public class ThreadDemo4 {
    /*
     * String getName()
     * void setName(String name)
     * static Thread currentThread()
     * static void sleep(long time)
     */

    public static void main(String[] args) {

        Mythread2 mythread1 = new Mythread2();
        Mythread2 mythread2 = new Mythread2();


        mythread1.start();
        mythread2.start();
    }
}

class Mythread2 extends Thread{
    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        try {
            for (int i = 0; i < 100; i++) {
                System.out.println(getName()+"@"+i);
                thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
