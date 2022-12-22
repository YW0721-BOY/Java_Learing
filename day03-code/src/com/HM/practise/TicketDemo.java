package com.HM.practise;

import java.util.Scanner;

/*
* 机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
* 按照如下规则计算机票价格：旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）
* 头等舱7折，经济舱6.5折。
*
 */
public class TicketDemo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入机票价格：");
        double ticket =sc.nextInt();
        System.out.println("请输入当前月份：");
        int month=sc.nextInt();
        System.out.println("请输入当前购买的舱位 0 头等舱 1 经济舱：");
        int seat =sc.nextInt();

        System.out.println("当前的机票价格："+getPrice(ticket,month,seat)+"元");



    }

    public static double getPrice(double ticket,int month,int seat){

        if (month>=5&&month<=10){
            if (seat==0){
                ticket *=0.9;
            }else{
                ticket *=0.85;
            }
        }else {
            if (seat==0){
                ticket *=0.7;
            }else{
                ticket *=0.65;
            }
        }
        return ticket;
    }

}
