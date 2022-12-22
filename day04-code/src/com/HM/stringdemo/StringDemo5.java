package com.HM.stringdemo;

import java.util.Scanner;

public class StringDemo5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str =sc.nextLine();

        int bigCount=0;
        int smallCount=0;
        int numberCount=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)>='a' && str.charAt(i)<='z'){
                smallCount++;
            }
            if (str.charAt(i)>='A'&& str.charAt(i)<='Z'){
                bigCount++;
            }
            if (str.charAt(i)>='0'&& str.charAt(i)<='9'){
                numberCount++;
            }
        }
        System.out.println("大写字母的个数："+bigCount);
        System.out.println("小写字母的个数："+smallCount);
        System.out.println("数字的个数："+numberCount);

    }
}
