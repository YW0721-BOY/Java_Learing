package com.HM.test4;

public class Product {
    public static void main(String[] args) {
        String num1="12345";
        String num2="123";

        int n1=strToNum(num1);
        int n2=strToNum(num2);

        System.out.println(n1*n2);


    }

    public static int strToNum(String str){
        int n1=0;
        for (int i = 0; i < str.length(); i++) {
            int n=str.charAt(i)-'0';
            n1=n1 *10+n;
        }
        return n1;
    }
}
