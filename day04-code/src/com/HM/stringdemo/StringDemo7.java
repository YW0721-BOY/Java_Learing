package com.HM.stringdemo;

import java.util.Scanner;

public class StringDemo7 {
    public static void main(String[] args) {
        int money;
        while (true) {
            System.out.println("需要转换的金额是多少：");
            Scanner sc =new Scanner(System.in);
            money = sc.nextInt();
            if (money>=0&&money<=9999999){
                break;
            }else {
                System.out.println("金额无效");
            }
        }
        //定义一个变量用来表示钱的大写
        String moneyStr ="";

        while (true){
            int ge =money %10;
            String capitalNumber = getCapitalNumber(ge);
            moneyStr=moneyStr+capitalNumber;
            money = money/10;
            if (money==0){
                break;
            }
        }

        moneyStr =StringDemo6.reverser(moneyStr);
        int count=7-moneyStr.length();
        for (int i=0;i<count;i++){
            moneyStr="零"+moneyStr;
        }
        System.out.println(moneyStr);

        String[] arr={"佰","拾","万","仟","佰","拾","元"};

        for (int i = 0; i < moneyStr.length(); i++) {
            char c =moneyStr.charAt(i);
            System.out.print(c);
            System.out.print(arr[i]);
        }
    }

    public static String getCapitalNumber(int number){
        String[] arr = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        return arr[number];
    }
}
