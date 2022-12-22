package com.HM.switchdemo;

/*
    switch新特性
    JDK 12
 */
public class SwitchDemo3 {
    public static void main(String[] args) {
           int num =1;
        switch (num){
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            default:
        }
//        switch (num){
//            case 1->{
//                System.out.println(1);
//            }
//            case 2->{
//                System.out.println(2);
//            }default -> {
//                System.out.println("其他");
//            }
//        }
    }

}
