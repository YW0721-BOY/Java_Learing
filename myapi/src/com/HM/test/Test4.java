package com.HM.test;

public class Test4 {
    public static void main(String[] args) {

        System.out.println(getCount(20));

    }
    public static int getCount(int n){
        if (n==1){
            return 1;
        }
        if (n==2){
            return 2;
        }if (n==3){
            return 4;
        }
        return getCount(n-1)+getCount(n-2)+getCount(n-3);
    }
}
