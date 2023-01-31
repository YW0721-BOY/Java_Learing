package com.HM.C_waitANDnotify;

import java.util.concurrent.ArrayBlockingQueue;

public class ThreadDemo01 {
    public static void main(String[] args) {
        /*
         * 需求：完成生产者和消费者（等待唤醒机制）的代码
         *      实现线程轮流交替执行的效果
         */

        Cook c=new Cook();
        Foodie f =new Foodie();

        Thread thread01 = new Thread(c,"厨师");
        Thread thread02 = new Thread(f,"吃货");

        thread01.start();
        thread02.start();


    }
}


class Desk {
    /*
     *作用：控制生产者和消费者的执行
     *
     *
     * 是否有面条  0：没有面条  1：有面条
     */


    public static int count = 10;
    public static int foodFlag = 0;

    public static Object lock = new Object();
}


class Foodie implements Runnable {

    @Override
    public void run() {
        while (true) {
            try {
                synchronized (Desk.lock) {
                    if (Desk.count == 0) {
                        break;
                    }else {
                        //先判断桌子上是否有面条
                        if (Desk.foodFlag==0){
                            //如果没有，就等待
                            Desk.lock.wait();//让当前线程跟锁进行绑定
                        }else {
                            //把吃的总数-1  10
                            Desk.count--;
                            //如果有，就开吃
                            System.out.println("吃货在吃面条，还能再吃"+Desk.count+"碗！！！");

                            //吃完之后，唤醒厨师继续做
                            Desk.lock.notifyAll();

                            //修改桌子的状态
                            Desk.foodFlag=0;
                        }
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
            }
        }
    }
}


class Cook implements Runnable{


    @Override
    public void run() {
        while (true){
            try {
                synchronized (Desk.lock){
                    if (Desk.count==0){
                        break;
                    }else {
                        //判断是否有食物
                        if (Desk.foodFlag==1){
                         Desk.lock.wait();
                        }else {
                            System.out.println("厨师做了一碗面条");

                            Desk.foodFlag=1;
                            Desk.lock.notifyAll();
                        }
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
            }
        }

    }
}
