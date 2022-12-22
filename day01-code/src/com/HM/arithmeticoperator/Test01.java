package com.HM.arithmeticoperator;

import java.util.Scanner;

//键盘录入一个三位数，获取其中的个位，十位，百位
public class Test01 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("请输入一个三位数：");
        int i = sc.nextInt();

        System.out.println("个位："+i%10);
        System.out.println("十位"+(i/10)%10);
        System.out.println("百位"+(i/100)%10);
    }
}
