package com.HM.ifdemo;

import java.util.Scanner;

public class IfDemo1 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("输入你的酒量：");
        int win=sc.nextInt();
        if (win>2) {
            System.out.println("可以");
        }else System.out.println("。。。。");
    }
}
