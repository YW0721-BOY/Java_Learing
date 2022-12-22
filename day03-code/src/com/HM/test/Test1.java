package com.HM.test;

public class Test1 {
    public static void main(String[] args) {
        compare((byte)1,(byte)1);
        compare((short) 1,(short) 1);
        compare(10,20);
        compare(10l,20l);


    }

    public static void compare(byte b1,byte b2){
        System.out.println(b1==b2);
    }
    public static void compare(short b1,short b2){
        System.out.println(b1==b2);
    }
    public static void compare(int b1,int b2){
        System.out.println(b1==b2);
    }
    public static void compare(long b1,long b2){
        System.out.println(b1==b2);
    }
}
