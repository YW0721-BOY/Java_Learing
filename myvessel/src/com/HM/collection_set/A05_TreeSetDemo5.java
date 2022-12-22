package com.HM.collection_set;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.function.Consumer;

public class A05_TreeSetDemo5 {
    public static void main(String[] args) {
        /*
         * 需求：利用TreeSet存储整数并进行排序
         */

        //1.创建TreeSet集合对象
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(4);
        ts.add(5);
        ts.add(1);
        ts.add(3);
        ts.add(2);

        System.out.println(ts);

        Iterator<Integer> iterator =ts.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        ts.forEach((integer)-> System.out.print(integer+" "));

    }
}
