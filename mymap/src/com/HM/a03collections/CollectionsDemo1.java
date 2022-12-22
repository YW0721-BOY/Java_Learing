package com.HM.a03collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo1 {
    public static void main(String[] args) {
        /*
        public static <T> boolean addAll (Collection<T> c,T...elements)  批量添加元素
        public static void shuffle(List<?> list)             打乱list集合元素的顺序
         */

        ArrayList<String> list =new ArrayList<>();

        Collections.addAll(list,"ac","abc","aaa","sda");

        System.out.println(list);

        Collections.shuffle(list);

        System.out.println(list);


    }
}
