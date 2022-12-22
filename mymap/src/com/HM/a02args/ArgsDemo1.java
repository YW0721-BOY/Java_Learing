package com.HM.a02args;

public class ArgsDemo1 {
    public static void main(String[] args) {
        /*
         假如需要定义一个方法求和，该方法可以灵活的完成如下需求：
         计算2个数据的和
         计算3个数据的和
         计算4个数据的和
         计算n个数据的和
         */
        System.out.println(getSum(1,2,3,4,5));
    }


    public static int getSum(int...args){
        int sum=0;
        for (int i : args) {
            sum=sum+i;
        }
        return sum;
    }
}
