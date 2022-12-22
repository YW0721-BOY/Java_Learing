package com.HM.switchdemo;
/*
* default的位置省略
*
* 1.位置：可以写在任意
* 2.省略:可以省略
 */

public class SwitchDemo1 {
    public static void main(String[] args) {
        int number =100;
        switch (number){
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            default:
                System.out.println(number);
        }

    }
}
