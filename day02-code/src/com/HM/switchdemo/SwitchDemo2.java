package com.HM.switchdemo;

/*
case 穿透
 */
public class SwitchDemo2 {
    public static void main(String[] args) {
        int number =1;
        switch (number){
            case 1:
                System.out.println("不加break,一直执行");
                //break;
            case 2:
                System.out.println("不加break,一直执行");
            case 3:
                System.out.println("不加break,一直执行");

        }
    }
}
