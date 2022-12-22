package com.HM.test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("输入被除数");
        int dividend =sc.nextInt();

        System.out.println("输入除数");
        int divisor =sc.nextInt();

        int count=0;
        while (dividend>=divisor){
            dividend=dividend-divisor;
            count++;
        }

        System.out.println("商为："+dividend);
        System.out.println("余数为："+count);

    }
}
