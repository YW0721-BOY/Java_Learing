package com.HM.test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入老虎体重：");
        int weight1=sc.nextInt();
        System.out.println("请输入老虎体重：");
        int weight2=sc.nextInt();

        System.out.println(weight1<weight2?"第二只老虎大":"第一只老虎大");
    }
}
