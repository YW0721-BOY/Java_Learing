package com.HM.E_threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThreadPoolDemo1 {
    public static void main(String[] args) {
        /*
         * public static ExecutorService newCachedThreadPool()             创建一个没有上限的线程池
         * public static ExecutorService newFixedThreadPool(int nThreads)  创建一个有上限的线程池
         */

        //创建线程池
        ExecutorService pool1 = Executors.newFixedThreadPool(3);

        //提交任务
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());

        pool1.shutdown();

    }
}

class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"---"+i);
        }
    }
}
