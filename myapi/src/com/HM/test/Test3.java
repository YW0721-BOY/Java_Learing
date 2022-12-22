package com.HM.test;

public class Test3 {
    public static void main(String[] args) {
        /*有一堆桃子，猴子第一天吃了其中的一半，并多吃了一个！
          以后每天猴子都吃当前剩下来的一半，然后再多吃一个，
          第10天是时候（还没吃），发现只剩一个桃子，问：最初有多少个桃子

         */

        System.out.println(getCount(1));


    }
    public static int getCount(int day){
        if (day<=0||day>=11){
            System.out.println("当前时间错误");
            return -1;
        }
        if (day==10){
            return 1;
        }
        return (getCount(day+1)+1)*2;

    }
}
