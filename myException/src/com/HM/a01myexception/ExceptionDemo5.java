package com.HM.a01myexception;
/*
*如果try中遇到的问题没有被捕获，怎么执行？
*
*相当于try catch 白写了，最终还是会交给虚拟机进行处理
*
 */
public class ExceptionDemo5 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};

        try {
            System.out.println(arr[10]);//ArrayIndexOutOfBoundsException
        } catch (NullPointerException e) {
            System.out.println("空指针异常");
        }

        System.out.println("这条语句执行了么");
    }
}
