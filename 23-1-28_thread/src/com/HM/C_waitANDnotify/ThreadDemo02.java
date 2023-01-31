package com.HM.C_waitANDnotify;

import java.util.concurrent.ArrayBlockingQueue;

public class ThreadDemo02 {
    /*
     * 需求：利用阻塞队列完成生产者和消费者（等待唤醒机制）的代码
     * 细节：
     *      生产者和消费者必须使用同一个阻塞队列
     */
    public static void main(String[] args) {

        //1.创建阻塞队列的对象
        ArrayBlockingQueue<String> queue=new ArrayBlockingQueue<>(1);

        Cook02 cook = new Cook02(queue);
        Foodie02 foodie = new Foodie02(queue);

        Thread t1 = new Thread(cook);
        Thread t2 = new Thread(foodie);

        t1.start();
        t2.start();

    }
}

class Cook02 implements Runnable{

    ArrayBlockingQueue<String> queue;

    public Cook02(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true){
            //不断的把面条放到阻塞队列当中
            try {
                queue.put("面条");
                System.out.println("厨师放了一碗面条");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class Foodie02 implements Runnable{

    ArrayBlockingQueue<String> queue;

    public Foodie02(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
    //不断从阻塞队列中获取面条
        while (true){
            try {
                String food =queue.take();
                System.out.println(food);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
