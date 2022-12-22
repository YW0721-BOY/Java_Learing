package com.HM.collection_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class A01_SetDemo1 {
    public static void main(String[] args) {
        Set<String> s =new HashSet<>();

//        boolean r1 = s.add("张三");
//        boolean r2 = s.add("张三");
//
//        s.add("张三");
//
//        System.out.println(r1);
//        System.out.println(r2);
//        System.out.println(s);

        s.add("张三");
        s.add("张三");
        s.add("李四");
        s.add("王五");
        System.out.println(s);

        System.out.println();

        Iterator iterator =s.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();

        for (String s1 : s) {
            System.out.println(s1);
        }

        System.out.println();

        s.forEach((str)-> System.out.println(str));
    }
}
