package com.HM.A_thread;

public class ThreadDemo1 {
    /*
    *   多线程的第一种启动方式
    *   1.自己定义一个类继承Thread
    *   2.重写run方法
    *   3.创建子类的对象，并启动线程
     */
    public static void main(String[] args) {
        MyThread m1 =new MyThread();
        MyThread m2 =new MyThread();
        m1.setName("线程1");
        m2.setName("线程2");
        m2.start();
        m1.start();
    }
}

class MyThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i <100; i++) {
            System.out.println(getName()+"Hello World");
        }
    }
}
