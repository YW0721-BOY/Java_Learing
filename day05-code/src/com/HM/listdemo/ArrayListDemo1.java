package com.HM.listdemo;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //ArrayList<String> list =new ArrayList<String>();
        ArrayList<String> list =new ArrayList<>();

        list.add("arraylist");
        list.add("bbb");
        list.add("ccc");

        list.remove("bbb");

        list.set(1,"ddd");

        //System.out.println(list.get(0));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list);
    }
}
