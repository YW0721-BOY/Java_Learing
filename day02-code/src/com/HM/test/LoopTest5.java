package com.HM.test;

import java.util.Random;
import java.util.Scanner;

public class LoopTest5 {
    public static void main(String[] args) {
        Random r =new Random();
        Scanner sc =new Scanner(System.in);
        int x =r.nextInt(100)+1;

        while (true){
            System.out.println("输入你猜的数字：");
            int number =sc.nextInt();
            if (number==x){
                System.out.println("你猜对了！");
                break;
            }else if (number>x){
                System.out.println("大了");
            }else System.out.println("小了");
        }
    }
}
