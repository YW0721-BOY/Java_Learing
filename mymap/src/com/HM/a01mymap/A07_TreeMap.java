package com.HM.a01mymap;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class A07_TreeMap {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap =new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        treeMap.put(3,"手机");
        treeMap.put(2,"书本");
        treeMap.put(1,"电脑");
        treeMap.put(4,"充电宝");


        Set<Map.Entry<Integer, String>> entries = treeMap.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey()+"------"+entry.getValue());
        }

    }
}
