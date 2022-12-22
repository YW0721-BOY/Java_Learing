package com.HM.test;

import java.util.Random;

public class ArrTest2 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        System.out.println(a);

        Random r=new Random();


        for (int i = 0; i < a.length; i++) {
            int index = r.nextInt(a.length);
            int temp =a[i];
            a[i]=a[index];
            a[index]=temp;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
