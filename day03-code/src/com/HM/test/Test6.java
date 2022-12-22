package com.HM.test;

public class Test6 {
    public static void main(String[] args) {
        int[] arr={10,20,30};
        System.out.println("调用change前："+arr[1]);
        change(arr);
        System.out.println("调用change后："+arr[1]);

    }
    public static void change(int[] arr){
        arr[1]=200;
    }
}
