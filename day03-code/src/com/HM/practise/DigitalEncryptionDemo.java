package com.HM.practise;
/*
*数字加密
* 某系统的数字密码（大于0），比如1983，采用加密方式进行传输
* 规则如下：
*   先得到每位数字，然后每位数字都加上5，再对10求余，最后将所有数字反转，得到一串新数字。
*
* 例：1983-》8346
 */

import com.HM.test.Test2;

public class DigitalEncryptionDemo {
    public static void main(String[] args) {
        int[] arr={1,9,8,3};
        System.out.println("加密后："+encryption(arr));
        System.out.println("解密后："+decrypt(arr));



    }
    public static int encryption(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i]+=5;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i]%=10;
        }

        for (int i = 0,j=arr.length-1; i < j; i++,j--) {
            int temp = arr[i];
            arr[i] =arr[j];
            arr[j] =temp;
        }

        int number =0;
        for (int i = 0; i < arr.length; i++) {
            number=number*10+arr[i];
        }
        return number;
    }
    public static int decrypt(int[] arr){
        for (int i = 0,j=arr.length-1; i < j; i++,j--) {
            int temp = arr[i];
            arr[i] =arr[j];
            arr[j] =temp;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>=0&&arr[i]<=4){
                arr[i]+=10;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i]-=5;
        }
        int number =0;
        for (int i = 0; i < arr.length; i++) {
            number=number*10+arr[i];
        }
        return number;
    }

}
