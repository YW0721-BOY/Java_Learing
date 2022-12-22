package com.HM.test;

import java.util.Scanner;

public class LoopTest2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("输入一个x：");
        int x =sc.nextInt();

        for (int i = 1; i < x; i++) {
            if (i*i==x){
                System.out.println("平方根是："+i);
                break;
            }else if(i*i>x){
                System.out.println("没有平方根");
                break;
            }
        }

    }
}
