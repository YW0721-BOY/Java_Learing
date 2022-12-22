package com.HM.test;

public class Test2 {
    public static void main(String[] args) {
        /*有一个很有名的数学逻辑题叫做不死神兔问题，有一对兔子，从出生后第三个月起每个月都生一对兔子
        小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问第十二个月的兔子对数为多少？
        1月：1
        2月：1
        3月：2
        4月：3
        5月：5
        6月：8

           特点：从第三个数据开始，是前两个数据的和（斐波那契数列）
         */

        int[] arr =new int[12];
        arr[0]=1;
        arr[1]=1;

        for (int i = 2; i < arr.length; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }
        System.out.println(arr[11]);

        System.out.println(getSum(12));

    }
    public static int getSum(int month){
        if (month==1||month==2){
            return 1;
        }
        return getSum(month-1)+getSum(month-2);
    }
}
