package com.HM.test4;

import java.util.Random;

public class Disturbance {
    public static void main(String[] args) {
        String str ="abcdefg";
        char[] arr =str.toCharArray();
        Random r=new Random();
        char a;
        for (int i = 0; i < arr.length; i++) {
            int s=r.nextInt(arr.length);
            a =arr[i];
            arr[i]=arr[s];
            arr[s]=a;
        }
        String result =new String(arr);
        System.out.println(result);
    }
}
