package com.HM.test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();
        int num=x;
        int temp=0;
        while (num !=0){
            int ge= num%10;
            num=num/10;
            temp =temp*10+ge;
        }
        if(temp==x)
            System.out.println("是回文数");
        else
            System.out.println("不是回文数");
    }
}
