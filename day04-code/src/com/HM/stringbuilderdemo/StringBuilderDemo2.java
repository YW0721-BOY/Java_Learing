package com.HM.stringbuilderdemo;

import java.util.Scanner;

/*
 *需求：键盘接受一个字符串，程序判断出该字符串是否是对称字符串，并在控制台打印是或不是
 * 对称字符串：123321、111
 * 非对称字符串：123123
 */
public class StringBuilderDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = sc.nextLine();

        String result = new StringBuilder().append(s).reverse().toString();

        if (result.equals(s)) {
            System.out.println("是");
        } else {
            System.out.println("不是");
        }


    }
}
