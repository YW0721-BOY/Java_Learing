package com.HM.practise;

import com.HM.test.Test2;

import java.util.Random;
import java.util.Scanner;

public class BicolorSphereDemo {
    public static void main(String[] args) {
        //1.生成中奖号码
        int[] arr=createNumber();

        Test2.printArr(arr);
        //2.输入彩票号码
        int[] user=userInputNumber();
        Test2.printArr(user);

        //3.判断用户中奖情况
        int redCount =0;
        int blueCount =0;

        for (int i = 0; i < user.length-1; i++) {
            int redNumber =user[i];
            for (int j = 0; j < arr.length-1; j++) {
                if (redNumber==arr[j]){
                    redCount++;
                    break;
                }
            }
        }

        int blueNumer = user[user.length-1];
        if(blueNumer ==arr[arr.length-1]){
            blueCount++;
        }


    }
    public static int[] userInputNumber(){
        int[] arr = new int[7];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; ) {
            System.out.println("请输入第"+(i+1)+"个红球号码");
            int redNumber =sc.nextInt();
            if (redNumber>=1&&redNumber<=33){
                //判断唯一性
                boolean flag =contains(arr,redNumber);
                if (!flag){
                    arr[i]=redNumber;
                    i++;
                }else {
                    System.out.println("当前红球已经存在，请重新输入");
                }
            }else System.out.println("超出范围！");
        }

        System.out.println("请输入蓝球号码：");
        while (true) {
            int blueNumber =sc.nextInt();
            if (blueNumber >=1&&blueNumber<=16){
                arr[arr.length-1]=blueNumber;
                break;
            }else {
                System.out.println("超出范围！");
            }

        }
        return arr;
    }

    public static int[] createNumber(){
        //1.创建数组用于添加中奖号码
        //6个红球 1个蓝球 数组长度：7
        int[] arr =new int[7];

        Random r =new Random();
        for (int i = 0; i < 6; ) {
            int redNumber =r.nextInt(33)+1;
            boolean flag =contains(arr,redNumber);
            if (!flag){
                arr[i]=redNumber;
                i++;
            }
        }
        int buleNumber=r.nextInt(16)+1;
        arr[arr.length-1]=buleNumber;

        return arr;
    }

    public static boolean contains(int[] arr,int number){

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number){
                return true;
            }
        }
        return false;
    }
}
