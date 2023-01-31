package com.HM.D_test;

import java.util.ArrayList;
import java.util.Collections;

public class Test04 {
    public static void main(String[] args) {
        /*
         * 有一个抽奖池，该抽奖池中存放了奖励的金额，该抽奖池中的奖项为{10,5,20,50,100,200,500,800,2,80,300,700}
         * 创建两个抽奖箱（线程）设置线程名称分别为“抽奖箱1”，“抽奖箱2”
         * 随机从抽奖池中获取奖项元素并打印在控制台上，格式如下：
         *              每次抽的过程不打印，最后抽完一次性打印
         *
         *
         *
         *
         *
         *
         */

        ArrayList<Integer> list=new ArrayList<>();
        Collections.addAll(list,10,5,20,50,100,200,500,800,2,80,300,700);

        MyThread04 t1 = new MyThread04(list);
        MyThread04 t2 = new MyThread04(list);


        t1.setName("抽奖箱1");
        t2.setName("抽奖箱2");

        t1.start();
        t2.start();



    }
}

class MyThread04 extends Thread{
    ArrayList<Integer> list;

    public MyThread04(ArrayList<Integer> list){
        this.list=list;
    }

    static ArrayList<Integer> list1=new ArrayList<>();
    static ArrayList<Integer> list2=new ArrayList<>();

    @Override
    public void run() {

        while (true){
            synchronized (MyThread01.class){
                if (list.size()==0){
                    if ("抽奖箱1".equals(getName())){
                        System.out.println("抽奖箱1："+list1);

                        int max=list1.get(0);
                        int sum=0;
                        for (Integer integer : list1) {
                            if (max<integer){
                                max=integer;
                            }
                            sum+=integer;
                        }
                        System.out.println("抽奖箱1的总金额为"+sum+"最大奖值为"+max);
                    }else{
                        System.out.println("抽奖箱2："+list2);
                    }

                    break;
                }else {
                    Collections.shuffle(list);
                    int prize =list.remove(0);
                    //System.out.println(getName()+"又产生了一个"+prize+"元大奖");

                    if ("抽奖箱1".equals(getName())){
                        list1.add(prize);
                    }else{
                        list2.add(prize);
                    }
                }
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
