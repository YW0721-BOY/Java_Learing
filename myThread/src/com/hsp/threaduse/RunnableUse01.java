package com.hsp.threaduse;

public class RunnableUse01 extends Thread{

    public static void main(String[] args) {
        T2 runnable =new T2();
        Thread t1=new Thread(runnable);
        t1.start();
    }

}

class T2 implements Runnable{

    @Override
    public void run() {

        int count=0;
        while (true) {
            System.out.println("实现Runnable接口，来开发线程");
            count++;
            if (count==10)break;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
