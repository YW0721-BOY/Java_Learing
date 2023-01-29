package com.HM.A_thread;

public class ThreadDemo7 {
    public static void main(String[] args) {
        /*
         * public static void yield()    出让线程/礼让线程
         *
         */
        MyThread03 t1=new MyThread03();
        MyThread03 t2=new MyThread03();

        t1.setName("飞机");
        t2.setName("坦克");

        t1.start();
        t2.start();

    }


}
class MyThread03 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <100; i++) {
            System.out.println(getName()+"@"+i);

            //表示出让当前CPU的执行权
            Thread.yield();
        }
    }
}
