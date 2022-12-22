package com.HM.practise;
/*
*需求：
* 把一个数组的元素复制到另一个新数组中去
 */

import com.HM.test.Test2;

public class ArrCopy {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};

        int[] x=ArrCopy(arr);

        Test2.printArr(x);

    }

    public static int[] ArrCopy(int[] arr){
        int[] nArr=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nArr[i]=arr[i];
        }
        return nArr;
    }
}
