package com.HM.test;

public class Test3 {
    public static void main(String[] args) {
        int[] arr={1,2,34,22,24,15,16,17};
        System.out.println(getMax(arr));

    }

    public static int getMax(int[] arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
