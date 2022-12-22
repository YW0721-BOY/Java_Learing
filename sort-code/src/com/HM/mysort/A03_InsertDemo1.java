package com.HM.mysort;

public class A03_InsertDemo1 {
    public static void main(String[] args) {
        int[] arr = {3,38,44,55,5,47,15,36,26,27,2,46,4,19,50,48};

        int startIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>arr[i+1]){
                startIndex =i+1;//4
                break;
            }
        }

        for (int i = startIndex; i < arr.length; i++) {
            int index=i;//从4开始
            while (index>0&&arr[index]<arr[index-1]){
                int temp = arr[index];
                arr[index]=arr[index-1];
                arr[index-1]=temp;
                index--;
            }
        }

        printArr(arr);


    }

    private static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

}


