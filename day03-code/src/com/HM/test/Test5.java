package com.HM.test;

public class Test5 {
    public static void main(String[] args) {
        int number =100;
        System.out.println(number);
        change(number);
        System.out.println("change number："+number);

    }

    public static void change(int number){
        number =200;
    }
}
