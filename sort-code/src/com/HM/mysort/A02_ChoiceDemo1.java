package com.HM.mysort;

public class A02_ChoiceDemo1 {
    public static void main(String[] args) {
        int[] arr={3,4,2,1,5,7,9};
        choice(arr);
        printArr(arr);

    }
    public static void choice(int[] arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (max<arr[j]){
                    max=arr[j];
                }
            }
//            arr[arr.length-1-i]=max;
        }
    }
    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }
    }
}
