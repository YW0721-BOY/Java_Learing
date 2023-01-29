package com.HM.A_thread;

/*
* 同步代码块
* synchronized(){}
 */
public class ThreadDemo9 {
    /*
     * 需求：线程安全问题
     * 某电影院目前正在上映国产大片，共有100张票，而它有3个窗口卖票，请设计一个程序模拟该电影院卖票
     */
    public static void main(String[] args) {
        Cinema cinema = new Cinema();

        Thread t1=new Thread(cinema,"窗口1");
        Thread t2=new Thread(cinema,"窗口2");
        Thread t3=new Thread(cinema,"窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}

class Cinema implements Runnable{

    static int ticket=0;

    //锁对象，一定要是唯一的
    //static Object obj =new Object();

    @Override
    public void run() {
        //同步代码块

            try {

                while (true) {
                    synchronized (MyThread.class) {
                        if (ticket < 100) {
                            ticket++;
                            System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
                            Thread.sleep(100);

                        } else {
                            break;
                        }
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

    }
}
