package com.HM.search;

public class A02_BinarySearchDemo1 {
    public static void main(String[] args) {
        int[] arr = {12, 14, 15, 23, 25, 36, 47, 89, 90, 91};

        System.out.println(binarySearch(arr,150));

    }

    public static int binarySearch(int[] arr, int num) {
//        int indexMin=0;
//        int indexMax=arr.length-1;
//        int mid =(indexMax+indexMin)/2;

//        while (true){
//            if (arr[mid]>num) {
//                indexMax=mid-1;
//                mid=(indexMax+indexMin)/2;
//                if (arr[indexMax]==num){
//                    return indexMax;
//                }
//            }else if(arr[mid]<num){
//                indexMin=mid+1;
//                mid=(indexMax+indexMin)/2;
//                if (arr[indexMin]==num){
//                    return indexMin;
//                }
//            }else if (arr[mid]==num){
//                return mid;
//            }else {
//                return -1;
//            }
//        }

        int min = 0;
        int max = arr.length - 1;

        while (true) {
            if (min > max) {
                return -1;
            }

            int mid = (min + max) / 2;
            if (arr[mid] > num) {
                max = mid - 1;
            } else if (arr[mid] < num) {
                min = mid + 1;
            } else {
                return mid;
            }
        }
    }
}
