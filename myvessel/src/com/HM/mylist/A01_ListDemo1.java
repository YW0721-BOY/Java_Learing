package com.HM.mylist;

import java.util.ArrayList;
import java.util.List;

public class A01_ListDemo1 {
    public static void main(String[] args) {

        List<String> list =new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        list.add(1,"qqq");
        System.out.println(list);

        list.remove("aaa");
        list.remove(1);

        System.out.println(list);
        list.set(0,"QQQ");

        System.out.println(list.get(0));


        System.out.println(list);
    }
}
