package com.HM.mylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class A03_ListDemo3 {
    public static void main(String[] args) {
        /*
        List系列集合的五种遍历方式
            1.迭代器
            2.列表迭代器
            3.增强for
            4.Lambda表达式
            5.普通for循环
         */
        List<String> list =new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        Iterator iterator =list.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        for(String s:list){
            System.out.print(s+" ");
        }
        System.out.println();
        list.forEach((s)-> System.out.print(s+" "));

        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }

        System.out.println();
        //列表迭代器
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()){

            String s =listIterator.next();
            System.out.print(s +" ");

            if ("bbb".equals(s)){
                listIterator.add("qqq");
            }
            //System.out.print(listIterator.next()+" ");
        }
        System.out.println();
        System.out.println(list);
    }
}
