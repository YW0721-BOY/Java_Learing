package com.HM.stringdemo;

public class StringDemo1 {
    public static void main(String[] args) {

        String s2 = new String();

        char[] chs ={'a','b','c'};
        String s4=new String(chs);

        System.out.println(s4);

        byte[] bytes ={97,98,99,100};
        String s5=new String(bytes);


    }
}
