package com.HM.practise;
/*
* 需求：
* 在唱歌比赛中，有6名评委给选手打分，分数范围是【0—100】之间的整数。
* 选手的最后得分为：去掉最高分、最低分后的4个评委的平均分。
* 请完成上述过程并计算出选手的得分
 */

import java.util.Scanner;

public class ScoreDemo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("有几个评委打分：");
        int n=sc.nextInt();
        int[] score=getScore(n);
        System.out.println("去掉一个最高分："+getMax(score));
        System.out.println("去掉一个最低分："+getMin(score));
        System.out.println("最终的平均分是："+getAvg(score,getMax(score),getMin(score)));



    }

    public static int[] getScore(int n){
        int[] score =new int[n];
        int temp;
        Scanner sc =new Scanner(System.in);
        for (int i = 0; i < score.length; i++) {
            System.out.println("请输入第"+(i+1)+"位评委的分数(0-100)：");
            temp=sc.nextInt();
            if (temp>=0&&temp<=100)
                score[i]=temp;
            else {
                System.out.println("!!!输入有误!!!");
                i--;
            }
        }

        return score;
    }

    public static int getMax(int[] score){
        int max = score[0];
        for (int i = 1; i < score.length; i++) {
            if (max<score[i]){
                max=score[i];
            }
        }
        return max;
    }
    public static int getMin(int[] score){
        int min = score[0];
        for (int i = 1; i < score.length; i++) {
            if (min>score[i]){
                min=score[i];
            }
        }
        return min;
    }

    public static int getAvg(int[] score,int max,int min){
        int sum=0;
        for (int i = 0; i < score.length; i++) {
            sum +=score[i];
        }
        int avg=(sum-max-min)/(score.length-2);
        return avg;
    }
}
