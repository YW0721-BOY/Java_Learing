package com.HM.search;

import java.util.ArrayList;

//基本查找
//需求：定义一个方法利用基本查找，查询某个元素的索引
//数据如下：{131，127，147，81，103，23，7，79}
//考虑元素重复
public class A01_BasicSearchDemo2 {
    public static void main(String[] args) {
        int[] arr ={131,127,147,81,103,23,7,7,81};
        ArrayList list=basicSearch(arr,81);
        System.out.println(list);


    }
    public static ArrayList basicSearch(int[] arr, int x){
        ArrayList<Integer> list =new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (x==arr[i]){
                list.add(i);
            }
        }
        return list;
    }
}
