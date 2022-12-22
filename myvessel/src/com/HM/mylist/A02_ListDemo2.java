package com.HM.mylist;

import java.util.ArrayList;
import java.util.List;

public class A02_ListDemo2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        /*2.删除元素
          请问：此时删除的是1这个元素，还是1索引上的元素？
          为什么？
          因为在调用方法的时候，如果方法出现了重载现象
          优先调用，实参和形参类型一致的那个方法
         */
        list.remove(1);
        System.out.println(list);
        //手动装箱
        Integer i =Integer.valueOf(1);
        list.remove(i);
        System.out.println(list);
    }
}
