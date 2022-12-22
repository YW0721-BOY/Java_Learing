package com.HM.search;

import java.util.ArrayList;

public class A01_BasicSearchDemo1 {
    public static void main(String[] args) {
        //基本查找
        //需求：定义一个方法利用基本查找，查询某个元素是否存在
        //数据如下：{131，127，147，81，103，23，7，79}

        int[] arr ={131,127,147,81,103,23,7,79};
        ArrayList arrayList =new ArrayList();

        arrayList.add(arr);
        System.out.println( basicSearch(arr,00));

    }

    public static boolean basicSearch(int[] arr,int x){
        for (int i = 0; i < arr.length; i++) {
            if (x==arr[i]){
                return true;
            }
        }
        return false;
    }
}
