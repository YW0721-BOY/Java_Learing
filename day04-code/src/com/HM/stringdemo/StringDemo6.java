package com.HM.stringdemo;

import java.util.Scanner;

public class StringDemo6 {
    public static void main(String[] args) {
        System.out.println("请输入需要反转的字符串：");
        Scanner sc =new Scanner(System.in);
        String s=sc.nextLine();

        System.out.println("反转之后的结果是："+reverser(s));

    }

    public static String reverser(String s){
        String result="";
        for (int i = s.length()-1; i >=0; i--) {
            result=result+s.charAt(i);
        }
        return result;
    }
}
