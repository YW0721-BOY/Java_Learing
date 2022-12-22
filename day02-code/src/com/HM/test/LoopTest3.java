package com.HM.test;

import java.util.Scanner;
/*
键盘输入一个数x,判断该整数是否为一个质数
 */

public class LoopTest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        boolean flag =true;
        for (int i = 2; i < number; i++) {
            if(number % i==0){
                flag =false;
            }
        }

        if (flag){
            System.out.println(number+"是质数");
        }else {
            System.out.println(number+"不是质数");
        }

    }
}
