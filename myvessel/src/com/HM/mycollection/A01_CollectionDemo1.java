package com.HM.mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class A01_CollectionDemo1 {
    public static void main(String[] args) {
        /*
        public boolean add(E e)                 添加
        public void clear()                     清空
        public boolean remove(E e)              删除
        public boolean contains(Object obj)     是否包含
        public boolean isEmpty()                是否为空
        public int size()                       集合长度


        注意点：
            Collection是一个接口
         */

        Collection<String> coll =new ArrayList<>();

        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");

        System.out.println(coll);

        coll.clear();
        System.out.println(coll);



    }
}
