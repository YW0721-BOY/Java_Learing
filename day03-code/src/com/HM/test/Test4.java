package com.HM.test;

public class Test4 {
    public static void main(String[] args) {
        int[] arr={11,22,23,24,15,30,60,99,100,20};
        Test2.printArr(copyOfRange(arr,3,7));

    }

    public static int[] copyOfRange(int[] arr,int from,int to){
        int[] nArr=new int[to-from];
        for (int i = 0; i < nArr.length; i++) {
            nArr[i]=arr[from];
            from+=1;
        }
        return nArr;
    }
}
