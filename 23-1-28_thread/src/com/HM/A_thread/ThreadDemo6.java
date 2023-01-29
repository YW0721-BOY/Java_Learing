package com.HM.A_thread;

public class ThreadDemo6 {
    /* 守护线程
     * final void setDaemon(boolean on)    设置为守护线程
     *
     * 细节：
     *      当其他非收回线程执行完毕之后，守护线程会陆续结束
     * 通俗易懂：
     *      当女神线程结束了，那么备胎也没有存在的必要了
     */
    public static void main(String[] args) {

        MyThread01 myThread01 = new MyThread01();
        Mythread02 mythread02 = new Mythread02();

        myThread01.setName("女神");
        mythread02.setName("舔狗");

        mythread02.setDaemon(true);

        myThread01.start();
        mythread02.start();
    }
}

class MyThread01 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName()+"@"+i);
        }
    }
}
class Mythread02 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+"@"+i);
        }
    }
}
