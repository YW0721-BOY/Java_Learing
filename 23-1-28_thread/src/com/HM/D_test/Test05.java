package com.HM.D_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test05 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {


        ArrayList<Integer> list=new ArrayList<>();
        Collections.addAll(list,10,5,20,50,100,200,500,800,2,80,300,700);

        MyThread05 myThread05 =new MyThread05(list);
        FutureTask<Integer> ft1=new FutureTask<>(myThread05);
        FutureTask<Integer> ft2=new FutureTask<>(myThread05);

        Thread t1 = new Thread(ft1);
        Thread t2 = new Thread(ft2);

        t1.setName("抽奖箱1");
        t2.setName("抽奖箱2");

        t1.start();
        t2.start();

        Integer max1 =ft1.get();
        Integer max2 =ft2.get();
        System.out.println(max1+" "+max2);


    }
}

class MyThread05 implements Callable {
    ArrayList<Integer> list;

    public MyThread05(ArrayList<Integer> list){
        this.list=list;
    }


    @Override
    public Object call() throws Exception {

        ArrayList<Integer>boxlist =new ArrayList<>();
        while (true){
            synchronized (MyThread01.class){
                if (list.size()==0){
                    System.out.println(Thread.currentThread().getName()+boxlist);
                    break;
                }else {
                    Collections.shuffle(list);
                    int prize =list.remove(0);
                    //System.out.println(getName()+"又产生了一个"+prize+"元大奖");
                    boxlist.add(prize);
                }
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (boxlist.size()==0){
            return null;
        }else {
            return Collections.max(boxlist);
        }
    }
}
